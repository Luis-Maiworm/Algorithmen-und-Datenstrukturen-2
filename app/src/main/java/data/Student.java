package data;

import sort.IComparator;

public class Student {

    public static final IComparator<Student> SurnameComparator = new IComparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.surname == null && o2.surname == null) {
                return 0;
            } else if (o1.surname == null) {
                return 1;
            } else if (o2.surname== null) {
                return -1;
            }
            return o1.surname.compareTo(o2.surname);
        }

    };


    private String surname;
    private String prename;
    private int course; // TODO: ENUM
    private int matriculationNumber;

    public Student(String surname, String prename, int course, int matriculationNumber) {
        super();
        this.surname = surname;
        this.prename = prename;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String toString() {
        return "Student [surname=" + surname + ", prename=" + prename + ", course=" + course + ", matriculationNumber="
                + matriculationNumber + "]";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

}
