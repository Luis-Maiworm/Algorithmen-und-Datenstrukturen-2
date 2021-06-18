package Comparators;

import data.Student;
import sort.IComparator;

public class MatriculationNumberComparator implements IComparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMatriculationNumber() -  o2.getMatriculationNumber();
    }

}