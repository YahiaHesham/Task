import java.util.Date;

public class ExpirableProduct extends Product implements Expiry {

     private  final  ExpiryHandler expiryHandler;

    public ExpirableProduct(String name, double price, int quantity,Date expiryDate) {
        super(name, price, quantity);
        this.expiryHandler = new ExpiryHandler(expiryDate);
    }

    @Override
    public boolean isExpired() {
        return  this.expiryHandler.isExpired();
    }

    @Override
    public Date getExpiryDate() {
        return this.expiryHandler.getExpiryDate();
    }
}
