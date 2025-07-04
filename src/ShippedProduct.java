public class ShippedProduct implements ShippedItem{
private final String name;
private double weight;

    public ShippedProduct(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
