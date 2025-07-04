public class ShippableProduct extends Product implements Shipping{

    public ShippableProduct(String name, double price, int quantity,double weight) {
        super(name, price, quantity) ;
        this.shippingHandler=new ShippingHandler(weight);
    }
    private final ShippingHandler shippingHandler;
    @Override
    public double getWeight() {
       return shippingHandler.getWeight();
    }
}
