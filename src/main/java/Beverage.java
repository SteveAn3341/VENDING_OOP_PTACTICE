public class Beverage extends Product {
    private double flOunces;

    public Beverage(String name, Double price, double flOunces) {
        super(name, price);
        this.flOunces = flOunces;
    }

    public double getFlOunces() {
        return flOunces;
    }

    public void setFlOunces(double flOunces) {
        this.flOunces = flOunces;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "flOunces=" + flOunces +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
