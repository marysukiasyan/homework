package university;

public class GpaCounter {

    public static void studentGpa(Student student) {
        double sumOfGrades = 0;
        int subjectNumbers = 0;
        double finalResult = 0;
        double[] grades = student.getGrades();

        try {
            if (student.getSubjects().length == 0) {
                throw new Exception(student.getName() + " doesn't have any subject");
            }
            try {
                for (int i = 0; i < grades.length; i++) {
                    if (grades[i] < 0 || grades[i] > 10) {
                        throw new Exception(student.getName() + "'s grades aren't right");
                    }
                }
                for (int i = 0; i < grades.length; i++) {
                    sumOfGrades += grades[i];
                    subjectNumbers++;
                }
                finalResult = sumOfGrades / subjectNumbers;
                System.out.println(student.getName() + "'s GPA is " + finalResult);
            } catch (Exception e) {
                System.out.println(student.getName() + "'s grades aren't right");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(student.getName() + " doesn't have any subject");
            e.printStackTrace();
        }
    }

    public static void subjectGpaForEachGroup(Group group, Subject subject) {
        int currentSubjectIndex = 0;
        int sumOfGrades = 0;
        double studentNumber = 0;
        double finalResult;
        Student[] studentsOfCurrentGroup = group.getGroupStudents();

        try {
            if (studentsOfCurrentGroup.length == 0) {
                throw new Exception("Group doesn't have students");
            }

            for (int i = 0; i < studentsOfCurrentGroup.length; i++) {
                Subject[] studentSubjects = studentsOfCurrentGroup[i].getSubjects();
                for (int j = 0; j < studentSubjects.length; j++) {
                    if (studentSubjects[j] == subject) {
                        double studentGradeForCurrentSubject = studentsOfCurrentGroup[i].getGrades()[j];
                        sumOfGrades += studentGradeForCurrentSubject;
                        studentNumber++;
                    }
                }
            }
            finalResult = sumOfGrades / studentNumber;
            System.out.println("Middle GPA for " + subject.getSubjectName() + " in Group " + group.getGroupNumber()
                    + " is " + finalResult);


        } catch (Exception e) {
            System.out.println("Group " + group.getGroupNumber() + " doesn't have students");
            e.printStackTrace();
        }
    }

    public static void subjectGpaForEachFaculty(Faculty faculty, Subject subject) {
        Group[] groupsOfFaculty = faculty.getFacultyGroups();
        int sumOfGrades = 0;
        double studentNumbers = 0;
        double finalResult;
        int index = 0;
        try {
            if (groupsOfFaculty.length == 0) {
                throw new Exception("Faculty doesn't have groups");
            }
            for (int i = 0; i < groupsOfFaculty.length; i++) {
                Student[] studentsOfCurrentGroup = groupsOfFaculty[i].getGroupStudents();
                for (int j = 0; j < studentsOfCurrentGroup.length; j++) {
                    Subject[] subjectsOfCurrentStudent = studentsOfCurrentGroup[j].getSubjects();
                    for (int k = 0; k < subjectsOfCurrentStudent.length; k++) {
                        if (subjectsOfCurrentStudent[k] == subject) {
                            double[] currentStudentGrades = studentsOfCurrentGroup[j].getGrades();
                            sumOfGrades += currentStudentGrades[k];
                            studentNumbers++;
                        }
                    }
                }
            }
            finalResult = sumOfGrades / studentNumbers;
            System.out.println(subject.getSubjectName() + " subject's GPA in " + faculty.getFacultyName() +
                    " faculty is " + finalResult);
        } catch (Exception e) {
            System.out.println(faculty.getFacultyName() + " faculty doesn't have groups");
            e.printStackTrace();
        }
    }

    public static void subjectGpaForUniversity(University university, Subject subject) {
        int sumOfGrades = 0;
        double studentNumbers = 0;
        double finalResult;
        Faculty[] universityFaculties = university.getFaculty();
        try {
            if (universityFaculties.length == 0) {
                throw new Exception("University doesn't have faculties");
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
                                sumOfGrades += currentStudentGrades[k];
                                studentNumbers++;
                            }
                        }
                    }
                }
            }
            finalResult = sumOfGrades / studentNumbers;
            System.out.println(subject.getSubjectName() + " subject's GPA in " + university.getUniName() +
                    " university is " + finalResult);
        } catch (Exception e) {
            System.out.println(university.getUniName() + " doesn't have faculties");
            e.printStackTrace();
        }
    }
}
