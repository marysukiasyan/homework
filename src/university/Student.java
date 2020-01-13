package university;

public class Student {

    private String name;
    private String surname;
    private double[] grades;
    private Subject[] subjects;

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSurname() {
        return surname;
    }


    public Student(String name, String surname, double[] grades, Subject[] subjects) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
        this.subjects = subjects;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }
}
