package exception;

public class Group {
    private int groupNumber;
    private Student[] groupStudents;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Group(int groupNumber, Student[] groupStudents) {
        this.groupNumber = groupNumber;
        this.groupStudents = groupStudents;
    }

    public Student[] getGroupStudents() {
        return groupStudents;
    }

    public void setGroupStudents(Student[] groupStudents) {
        this.groupStudents = groupStudents;
    }


}
