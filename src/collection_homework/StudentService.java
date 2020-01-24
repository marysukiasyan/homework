package collection_homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentService {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Snow", 24));
        students.add(new Student("Ann", "Smith", 25));

        //1
        System.out.println("FirstName sorting");
        Collections.sort(students, new FirstNameComparator());
        printStudentsArrayList(students);

        //1
        Collections.sort(students, new AgeComparator());
        System.out.println("Age sorting");

        printStudentsArrayList(students);

        //2
        LinkedList<Student> studentsList = new LinkedList<>();

        studentsList.add(new Student("Elle", "Spinella", 23));
        studentsList.add(new Student("Berie", "Leister", 23));
        studentsList.add(new Student("Lily", "Byer", 22));
        studentsList.add(new Student("Yvonne", "Williams", 25));
        studentsList.add(new Student("David", "Thares", 20));

        Collections.sort(studentsList, new LastNameComparator());

        System.out.println("LastName sorting");
        printStudentsLinkedList(studentsList);

        //3

        System.out.println("3th task");

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

        printStudentsDynamicArray(studentsDynamicArray);

        //4
        System.out.println("4th task");

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.push(poghos);
        linkedList.push(petros);
        linkedList.pop();
        linkedList.addLast(petros);
        linkedList.addLast(martiros);
        linkedList.removeLast();

        printStudentsDoublyLinkedList(linkedList);
    }

    private static void printStudentsArrayList(ArrayList<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            iterator.next().studentData();
        }
    }

    private static void printStudentsLinkedList(LinkedList<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            iterator.next().studentData();
        }
    }

    private static void printStudentsDynamicArray(DynamicArray students){
        for (int i = 0; i < students.size(); i++) {
            students.get(i).studentData();
        }
    }

    private static void printStudentsDoublyLinkedList(DoublyLinkedList students){
        DoublyLinkedList.Node current = students.getHead();
        if(current == null){
            System.out.println("List is empty");
        }
        while(current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}