package exception;

public class Faculty {
    private String facultyName;
    private Group[] facultyGroups;

    public Faculty(String facultyName, Group[] facultyGroups) {
        this.facultyName = facultyName;
        this.facultyGroups = facultyGroups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Group[] getFacultyGroups() {
        return facultyGroups;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyGroups(Group[] facultyGroups) {
        this.facultyGroups = facultyGroups;
    }
}
