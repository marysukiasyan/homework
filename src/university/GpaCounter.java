package university;

import university.exception.*;

public class GpaCounter {

    public static void studentGpa(Student student) {
        double sumOfGrades = 0;
        int subjectNumbers = 0;
        double finalResult = 0;
        double[] grades = student.getGrades();

        if (student.getSubjects().length == 0 || student.getSubjects() == null) {
            System.out.println(student.getName() + " doesn't have any subject");
            throw new SubjectsMissingException("Student doesn't have subjects");
        } else if (student.getSubjects().length != 0 && student.getSubjects() != null) {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] < 0 || grades[i] > 10) {
                    System.out.println(student.getName() + "'s grades aren't right");
                    throw new WrongGradesException("Wrong grades");
                }
                sumOfGrades += grades[i];
                subjectNumbers++;
            }
            finalResult = sumOfGrades / subjectNumbers;
            System.out.println(student.getName() + "'s GPA is " + finalResult);
        }
        }


    public static void subjectGpaForEachGroup(Group group, Subject subject) {
        int currentSubjectIndex = 0;
        int sumOfGrades = 0;
        double studentNumber = 0;
        double finalResult;
        Student[] studentsOfCurrentGroup = group.getGroupStudents();

            if (studentsOfCurrentGroup.length == 0 || studentsOfCurrentGroup == null) {
                System.out.println("Group " + group.getGroupNumber() + " doesn't have students");
                throw new StudentsMissingException("Group doesn't have students");
            }
            for (int i = 0; i < studentsOfCurrentGroup.length; i++) {
                Subject[] studentSubjects = studentsOfCurrentGroup[i].getSubjects();
                if (studentsOfCurrentGroup[i].getGrades() != null) {
                    for (int j = 0; j < studentSubjects.length; j++) {
                        if (studentSubjects[j] == subject) {
                            if (j < studentsOfCurrentGroup[i].getGrades().length) {
                                double studentGradeForCurrentSubject = studentsOfCurrentGroup[i].getGrades()[j];
                                sumOfGrades += studentGradeForCurrentSubject;
                                studentNumber++;
                            }
                        }
                    }
                }
            }
                finalResult = sumOfGrades / studentNumber;
                System.out.println("Middle GPA for " + subject.getSubjectName() + " in Group " + group.getGroupNumber()
                        + " is " + finalResult);
        }

    public static void subjectGpaForEachFaculty(Faculty faculty, Subject subject) {
        Group[] groupsOfFaculty = faculty.getFacultyGroups();
        int sumOfGrades = 0;
        double studentNumbers = 0;
        double finalResult;
        int index = 0;
            if (groupsOfFaculty.length == 0 || groupsOfFaculty == null) {
                System.out.println(faculty.getFacultyName() + " faculty doesn't have groups");
                throw new GroupsMissingException("Faculty doesn't have groups");
            }
            for (int i = 0; i < groupsOfFaculty.length; i++) {
                Student[] studentsOfCurrentGroup = groupsOfFaculty[i].getGroupStudents();
                for (int j = 0; j < studentsOfCurrentGroup.length; j++) {
                    Subject[] subjectsOfCurrentStudent = studentsOfCurrentGroup[j].getSubjects();
                    for (int k = 0; k < subjectsOfCurrentStudent.length; k++) {
                        if (subjectsOfCurrentStudent[k] == subject) {
                            double[] currentStudentGrades = studentsOfCurrentGroup[j].getGrades();
                            if(currentStudentGrades != null) {
                                if (k < currentStudentGrades.length) {
                                    sumOfGrades += currentStudentGrades[k];
                                    studentNumbers++;
                                }
                            }
                        }
                    }
                }
            }
            finalResult = sumOfGrades / studentNumbers;
            System.out.println(subject.getSubjectName() + " subject's GPA in " + faculty.getFacultyName() +
                    " faculty is " + finalResult);
    }

    public static void subjectGpaForUniversity(University university, Subject subject) {
        int sumOfGrades = 0;
        double studentNumbers = 0;
        double finalResult;
        Faculty[] universityFaculties = university.getFaculty();

            if (universityFaculties.length == 0 || universityFaculties == null) {
                System.out.println(university.getUniName() + " doesn't have faculties");
                throw new FacultiesMissingException("University doesn't have faculties");
            }
            for (int m = 0; m < universityFaculties.length; m++) {
                Group[] groupsOfFaculty = universityFaculties[m].getFacultyGroups();
                for (int i = 0; i < groupsOfFaculty.length; i++) {
                    Student[] studentsOfCurrentGroup = groupsOfFaculty[i].getGroupStudents();
                    for (int j = 0; j < studentsOfCurrentGroup.length; j++) {
                        Subject[] subjectsOfCurrentStudent = studentsOfCurrentGroup[j].getSubjects();
                        for (int k = 0; k < subjectsOfCurrentStudent.length; k++) {
                            if (subjectsOfCurrentStudent[k] == subject) {
                                double[] currentStudentGrades = studentsOfCurrentGroup[j].getGrades();
                                if (currentStudentGrades != null) {
                                    if ((k < currentStudentGrades.length)) {
                                        sumOfGrades += currentStudentGrades[k];
                                        studentNumbers++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            finalResult = sumOfGrades / studentNumbers;
            System.out.println(subject.getSubjectName() + " subject's GPA in " + university.getUniName() +
                    " university is " + finalResult);
    }

}
