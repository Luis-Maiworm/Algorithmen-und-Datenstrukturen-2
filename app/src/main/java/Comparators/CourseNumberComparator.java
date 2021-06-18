package Comparators;

import data.Student;
import sort.IComparator;

public class CourseNumberComparator implements IComparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() -  o2.getCourse();
    }

}