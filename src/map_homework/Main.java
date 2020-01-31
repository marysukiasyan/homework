package map_homework;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Diana", "Asatryan", 22, "0988111111",
                "Math");
        Student s2 = new Student("Diana", "Asatryan", 23, "0988111111",
                "Math");
        Student s3 = new Student("Diana", "Asatryan", 24, "0988111111",
                "Math");
        Student s4 = new Student("Dia", "Asatryan", 24, "0988111111",
                "Math");
        Student s5 = new Student("Dia", "Asatryan", 22, "0988111111",
                "Math");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s3);
        students.add(s4);
        students.add(s2);
        students.add(s5);
        students.add(s1);


        StudentService.getStudentsMap(students);
    }
}
