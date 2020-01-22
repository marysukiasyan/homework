package university;

public class University {
    private String uniName;
    private Faculty[] faculty;

    public University(String uniName, Faculty[] faculty) {
        this.uniName = uniName;
        this.faculty = faculty;
    }

    public String getUniName() {
        return uniName;
    }

    public Faculty[] getFaculty() {
        return faculty;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public void setFaculty(Faculty[] faculty) {
        this.faculty = faculty;
    }
}
