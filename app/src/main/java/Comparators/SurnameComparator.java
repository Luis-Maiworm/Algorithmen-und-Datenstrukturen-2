package Comparators;

import data.Student;
import sort.IComparator;

public class SurnameComparator implements IComparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getSurname() == null && o2.getSurname() == null) {
            return 0;
        } else if (o1.getSurname() == null) {
            return 1;
        } else if (o2.getSurname() == null) {
            return -1;
        }
        return o1.getSurname().compareTo(o2.getSurname());
    }

}
