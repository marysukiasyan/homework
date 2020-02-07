package set_homework.model;

public class Glasses implements Comparable<Glasses> {
    private String type;
    private double price;

    public Glasses(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Glasses glasses) {
        return this.type.compareTo(glasses.type);
    }
}
