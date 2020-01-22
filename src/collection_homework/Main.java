package collection_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList();
        students.add(new Student("John", "Snow", 24));
        students.add(new Student("Ann", "Smith", 25));

        System.out.println("Before sorting");
        for(Student student: students){
            System.out.println(student);
        }
        //1
        System.out.println("FirstName sorting");
        Collections.sort(students, new FirstNameComparator());
        for(Student student: students){
            System.out.println(student);
        }
        //1
        Collections.sort(students, new AgeComparator());
        System.out.println("Age sorting");
        for(Student student: students){
            System.out.println(student);
        }
        //2
        LinkedList<Student> studentsList = new LinkedList();

        studentsList.add(new Student("Elle", "Spinella", 23));
        studentsList.add(new Student("Berie", "Leister", 23));
        studentsList.add(new Student("Lily", "Byer", 22));
        studentsList.add(new Student("Yvonne", "Williams", 25));
        studentsList.add(new Student("David", "Thares", 20));

        System.out.println("Before sorting");
        for(Student student: studentsList){
            System.out.println(student);
        }

        Collections.sort(studentsList, new LastNameComparator());

        System.out.println("LastName sorting");
        for(Student student: studentsList){
            System.out.println(student);
        }
    }
}