package exception;

public class Main {
    public static void main(String[] args) {

        Subject mathLogic = new Subject("Math Logic");
        Subject operatingSystems = new Subject("Operating Systems");
        Subject machineLearning = new Subject("Machine Learning");
        Subject dataBases = new Subject("Data Bases");

        Student john = new Student("John", "Snow", new double[] {4, 5, 11, 7});
        Student daenerys = new Student("Daenerys", "Targaryen", new double[]{2, 4, 7, 9});
        Student arya = new Student("Arya", "Stark", new double[]{7, 8, 5});
        Student tyrion = new Student("Tyron", "Lannister", new double[]{8, 9, 6});

        Group groupOne = new Group(1, new Subject[]{mathLogic, operatingSystems, machineLearning, dataBases},
                new Student[]{john, daenerys});
        Group groupTwo = new Group(2, new Subject[]{mathLogic, machineLearning, dataBases},
                new Student[]{arya, tyrion});

        Faculty computerScience = new Faculty("Computer Science", new Group[]{groupOne});
        Faculty mathematics = new Faculty("Mathematics", new Group[]{groupTwo});

        University ysu = new University("YSU", new Faculty[]{computerScience, mathematics});

        GpaCounter.studentGpa(daenerys);
        GpaCounter.studentGpa(john);

        GpaCounter.subjectGpaForEachGroup(groupOne, mathLogic);

        GpaCounter.subjectGpaForEachFaculty(computerScience, machineLearning);
        
        GpaCounter.subjectGpaForUniversity(ysu, dataBases);
    }
}

