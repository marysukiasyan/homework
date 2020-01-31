package map_homework;

import java.util.*;

public class StudentService {
    private Student[] students;

    public static Map<Student, Integer> getStudentsMap(ArrayList<Student> students) {

        Map<Student, Integer> studentsMapOfSameName = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if (studentsMapOfSameName.containsKey(currentStudent)) {
                studentsMapOfSameName.put(currentStudent, studentsMapOfSameName.get(currentStudent) + 1);
            }
            else {
                studentsMapOfSameName.put(currentStudent, 1);
            }
            }

        printMap(studentsMapOfSameName);
        return studentsMapOfSameName;
    }

    public static void printMap(Map<Student, Integer> map){
        for (Map.Entry<Student, Integer> mapEntry: map.entrySet()){
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }

}

