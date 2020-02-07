package set_homework;

import set_homework.model.Coffee;
import set_homework.model.Glasses;
import set_homework.model.Student;

public class Main {

    public static void main(String[] args) {
        TreeSetImplementation<Student> studentSet = new TreeSetImplementation<>();

        Student s1 = new Student("Poghos", "Poghosyan", 21);
        Student s2 = new Student("Petros", "Petrosyan", 22);
        Student s3 = new Student("Martiros", "Martirosyan", 22);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        studentSet.print();


        TreeSetImplementation<Coffee> coffeeSet = new TreeSetImplementation<>();

        Coffee c1 = new Coffee("Americano", 20);
        Coffee c2 = new Coffee("Espresso", 25);

        coffeeSet.add(c1);
        coffeeSet.add(c2);

        coffeeSet.print();

        TreeSetImplementation<Glasses> glassesSet = new TreeSetImplementation<>();

        Glasses g1 = new Glasses("Full Frame", 15);
        Glasses g2 = new Glasses("Semi-rimless Frame", 20);

        glassesSet.add(g1);
        glassesSet.add(g2);

        glassesSet.print();

    }
}
