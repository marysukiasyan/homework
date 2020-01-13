package university;

public class Main {
    public static void main(String[] args) {

        Subject mathLogic = new Subject("Math Logic");
        Subject operatingSystems = new Subject("Operating Systems");
        Subject machineLearning = new Subject("Machine Learning");
        Subject dataBases = new Subject("Data Bases");

        Student.StudentBuilder john = new Student.StudentBuilder("John", "Snow")
                .grades(new double[]{4, 5, 10, 7})
                .subjects(new Subject[]{mathLogic, operatingSystems, machineLearning, dataBases});
        Student John = john.build();

        Student.StudentBuilder daenerys = new Student.StudentBuilder("Daenerys", "Targaryen")
                .grades(new double[]{2, 4, 7})
                .subjects(new Subject[]{mathLogic, machineLearning, dataBases});
        Student Daenerys = daenerys.build();

        Student.StudentBuilder arya = new Student.StudentBuilder("Arya", "Stark")
                .grades(new double[]{7, 8})
                .subjects(new Subject[]{operatingSystems, dataBases});
        Student Arya = arya.build();

        Student.StudentBuilder tyrion = new Student.StudentBuilder("Tyrion", "Lannister")
                .grades(new double[]{8, 9})
                .subjects(new Subject[]{machineLearning, dataBases});
        Student Tyrion = tyrion.build();


        Group groupOne = new Group(1, new Student[]{John, Daenerys});
        Group groupTwo = new Group(2, new Student[]{Arya, Tyrion});

        Faculty computerScience = new Faculty("Computer Science", new Group[]{groupOne});
        Faculty mathematics = new Faculty("Mathematics", new Group[]{groupTwo});

        University ysu = new University("YSU", new Faculty[]{computerScience, mathematics});

        GpaCounter.studentGpa(daenerys);
        GpaCounter.studentGpa(john);

        GpaCounter.subjectGpaForEachGroup(groupOne, machineLearning);

        GpaCounter.subjectGpaForEachFaculty(computerScience, machineLearning);

        GpaCounter.subjectGpaForUniversity(ysu, dataBases);


    }
}
