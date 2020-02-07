package set_homework.model;

public class Coffee implements Comparable<Coffee> {
    private String type;
    private double price;

    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Coffee coffee) {
        return this.type.compareTo(coffee.type);
    }
}
