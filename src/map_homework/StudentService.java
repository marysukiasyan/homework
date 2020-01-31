package map_homework;

import java.util.*;

public class StudentService {

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

    public static void printFacultyMap(Map<String, Integer> map){
        for (Map.Entry<String, Integer> mapEntry: map.entrySet()){
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }

    public static Map<String, Integer> getStudentsFaculties(ArrayList<Student> students){

        Map<String, Integer> facultyMap = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            String currentFaculty = students.get(i).getFaculty();
            if(facultyMap.containsKey(currentFaculty)){
                facultyMap.put(currentFaculty, facultyMap.get(currentFaculty) + 1);
            }
            else{
                facultyMap.put(currentFaculty, 1);
            }
        }
        printFacultyMap(facultyMap);
        return facultyMap;
    }

}