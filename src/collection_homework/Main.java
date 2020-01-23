package collection_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
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
        LinkedList<Student> studentsList = new LinkedList<>();

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

        //3
        DynamicArray studentsDynamicArray = new DynamicArray();

        Student poghos = new Student("Poghos", "Poghosyan", 23);
        Student petros = new Student("Petros", "Petrosyan", 24);
        Student martiros  = new Student("Martiros", "Martirosyan", 25);

        studentsDynamicArray.add(poghos);
        studentsDynamicArray.add(petros);
        studentsDynamicArray.add(martiros);
        studentsDynamicArray.add(petros);
        studentsDynamicArray.add(martiros);

        studentsDynamicArray.remove(martiros);
        studentsDynamicArray.remove(petros);
        studentsDynamicArray.remove(poghos);

        for (int i = 0; i < studentsDynamicArray.getStudentsArray().length; i++) {
            System.out.println(studentsDynamicArray.getStudentsArray().length);
            System.out.println(studentsDynamicArray.getStudentsArray()[i]);
        }

        System.out.println(studentsDynamicArray.get(1));
        System.out.println(studentsDynamicArray.size());

        //4
        System.out.println("4th task");

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.push(poghos);
        linkedList.push(petros);
        linkedList.pop();
        linkedList.addLast(petros);
        linkedList.addLast(martiros);
        linkedList.removeLast();
        System.out.println(linkedList.size());

        linkedList.print();
    }
}