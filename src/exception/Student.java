package exception;

public class Student {

    private String name;
    private String surname;
    private double[] grades;

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


    public Student(String name, String surname, double[] grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }
}
