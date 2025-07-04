public class ShippingHandler implements Shipping {
    private final double weight;

    public ShippingHandler(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}