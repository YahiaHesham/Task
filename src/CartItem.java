public class CartItem {
    private final Product product;
    private int quantity;
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        if(product.getQuantity() < this.quantity) {
            throw new IllegalArgumentException("The product has less than the quantity");
        }
        if(product instanceof Expiry ) {
            if(((Expiry) product).isExpired())
                throw new IllegalArgumentException("The product has expired");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public String toString() {
        return  quantity+"x"+product.getName()+"       "+product.getPrice();
    }
}
