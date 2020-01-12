package exception;

public class Group {
    private int groupNumber;
    private Subject[] subjects;
    private Student[] groupStudents;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Group(int groupNumber, Subject[] subjects, Student[] groupStudents) {
        this.groupNumber = groupNumber;
        this.subjects = subjects;
        this.groupStudents = groupStudents;
    }

    public Student[] getGroupStudents() {
        return groupStudents;
    }

    public void setGroupStudents(Student[] groupStudents) {
        this.groupStudents = groupStudents;
    }


    public Subject[] getSubjects() {
        return subjects;
    }


    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
