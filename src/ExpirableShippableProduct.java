import java.util.Date;

public class ExpirableShippableProduct extends Product implements Shipping,Expiry{
    public ExpirableShippableProduct(String name, double price, int quantity, Date expiryDate, double weight) {
        super(name, price, quantity);
        this.shippingHandler=new ShippingHandler(weight);
        this.expiryHandler=new ExpiryHandler(expiryDate);

    }

    private final ShippingHandler shippingHandler;
    private final ExpiryHandler expiryHandler;

    @Override
    public boolean isExpired() {
        return expiryHandler.isExpired();
    }

    @Override
    public Date getExpiryDate() {
        return expiryHandler.getExpiryDate();
    }

    @Override
    public double getWeight() {
        return shippingHandler.getWeight();
    }
}
