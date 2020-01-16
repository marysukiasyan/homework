package university;

import university.exception.StudentsMissingException;
import university.exception.WrongGradesException;

public class Main {
    public static void main(String[] args) throws StudentsMissingException, WrongGradesException {

        Subject mathLogic = new Subject("Math Logic");
        Subject operatingSystems = new Subject("Operating Systems");
        Subject machineLearning = new Subject("Machine Learning");
        Subject dataBases = new Subject("Data Bases");

        Student john = new Student.StudentBuilder("John", "Snow")
                .grades(new double[]{4, 5, 10, 7})
                .subjects(new Subject[]{})
                .build();

        Student daenerys = new Student.StudentBuilder("Daenerys", "Targaryen")
                .grades(new double[]{3, 5, 10})
                .subjects(new Subject[]{mathLogic, machineLearning, dataBases})
                .build();

        Student arya = new Student.StudentBuilder("Arya", "Stark")
                .grades(new double[]{7, 8})
                .subjects(new Subject[]{mathLogic, machineLearning})
                .build();

        Student tyrion = new Student.StudentBuilder("Tyrion", "Lannister")
                .grades(new double[]{8, 9})
                .subjects(new Subject[]{machineLearning, dataBases})
                .build();


        Group groupOne = new Group(1, new Student[]{john, daenerys});
        Group groupTwo = new Group(2, new Student[]{arya, tyrion});

        Faculty computerScience = new Faculty("Computer Science", new Group[]{groupOne});
        Faculty mathematics = new Faculty("Mathematics", new Group[]{groupTwo});

        University ysu = new University("YSU", new Faculty[]{computerScience, mathematics});

        TryCatchMethods.TryCatchForGradesOrSubjects(john);
        TryCatchMethods.TryCatchForGradesOrSubjects(daenerys);

        TryCatchMethods.TryCatchForGroupStudents(groupOne, machineLearning);

        TryCatchMethods.TryCatchForFacultyGroups(computerScience, machineLearning);

        TryCatchMethods.TryCatchForUniversityFaculties(ysu, dataBases);
    }
}
