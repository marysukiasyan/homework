package university;

import university.exception.SubjectsMissingException;
import university.exception.WrongGradesException;

public class Student {

    private String name;
    private String surname;
    private double[] grades;
    private Subject[] subjects;

    private Student(StudentBuilder builder) {
        name = builder.name;
        surname = builder.surname;
        subjects = builder.subjects;
        grades = builder.grades;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double[] getGrades() {
        return grades;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public static class StudentBuilder {
            private String name;
            private String surname;
            private double[] grades;
            private Subject[] subjects;

            public StudentBuilder(String name, String surname){
                this.name = name;
                this.surname = surname;
            }

            public StudentBuilder grades(double[] grades) {
                this.grades = grades;
                return this;
            }

            public StudentBuilder subjects(Subject[] subjects) {
                this.subjects = subjects;
                return this;
            }

            public Student build(){
                Student student = new Student(this);
                return student;
            }

        public Subject[] getSubjects() {
            return subjects;
        }

        public String getName() {
            return name;
        }

        public double[] getGrades() {
            return grades;
        }

        public String getSurname() {
            return surname;
        }
    }

}
