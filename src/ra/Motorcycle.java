package ra;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    public Motorcycle() {
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}