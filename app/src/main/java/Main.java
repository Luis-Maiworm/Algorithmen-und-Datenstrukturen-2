import Comparators.CourseNumberComparator;
import Comparators.MatriculationNumberComparator;
import Comparators.PrenameComparator;
import Comparators.SurnameComparator;
import data.Student;
import lists.DoublyLinkedList;
import lists.IListable;
import lists.SinglyLinkedList;
import sort.BubbleSort;
import sort.IComparator;
import sort.ISortable;
import sort.SelectionSort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        test(new SinglyLinkedList<Student>());
        test(new DoublyLinkedList<Student>());
    }

    private static void test(IListable<Student> list) {
        Student s1 = new Student("Micky", "Maus", 89, 8);
        Student s2 = new Student("Jack", "Ryan", 67, 1);
        Student s3 = new Student("Ted", "Mosby", 7, 4);

        list.add(s1);
        list.add(s2);
        list.add(s3);


        List<Student> lista = Arrays.asList(s1, s2, s3);



        sortAndPrintStudents(lista, new SelectionSort<Student>(), new MatriculationNumberComparator());
        sortAndPrintStudents(lista, new SelectionSort<Student>(), new CourseNumberComparator());
        sortAndPrintStudents(lista, new SelectionSort<Student>(), new SurnameComparator());
        sortAndPrintStudents(lista, new SelectionSort<Student>(), new PrenameComparator());

        sortAndPrintStudents(lista, new BubbleSort<Student>(), new MatriculationNumberComparator());
        sortAndPrintStudents(lista, new BubbleSort<Student>(), new CourseNumberComparator());
        sortAndPrintStudents(lista, new BubbleSort<Student>(), new SurnameComparator());
        sortAndPrintStudents(lista, new BubbleSort<Student>(), new PrenameComparator());

        //print(list);
    }

    private static void print(IListable<Student> list) {
        System.out.println("---------------------------------");
        System.out.println("Class: " + list.getClass().getSimpleName());
        System.out.println("Size: " + list.size());
        System.out.println("IsEmpty: " + list.isEmpty());
        list.printAll();
        System.out.println("Get (2): " + list.get(2) );
        System.out.println("Get (-1): " + list.get(-1) );
        System.out.println("Get (3): " + list.get(3) );
        System.out.println("Get (0): " + list.get(0));



    }

    private static void sortAndPrintStudents(List<Student> list, ISortable<Student> algorithm,
                                             IComparator<Student> comp) {
        System.out.println("---------------------------------------");
        System.out.println("Sort-Algorithm: " + algorithm.getClass().getSimpleName());
        System.out.println("Comparator: " + comp.getClass().getSimpleName());
        algorithm.sort(list,comp);
        printStudents(list);
    }
    private static void printStudents(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }




}

