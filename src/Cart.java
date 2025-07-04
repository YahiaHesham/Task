import java.util.ArrayList;

public class Cart {
    private CartItem[] cartItems;
    private ShippingService shippingService ;
    private double total;
    public Cart(CartItem[] cartItems) {
        this.cartItems = cartItems;

    }

    public CartItem[] getCartItems() {
        return cartItems;
    }


    public double calculateTotal(){
        double total = 0;
        for (CartItem cartItem : cartItems) {
            total += cartItem.getQuantity()*cartItem.getProduct().getPrice();

        }
        return  this.total=total;
    }
    public void AdjustQuantity(){
        for (CartItem cartItem : cartItems) {
            cartItem.getProduct().setQuantity(cartItem.getProduct().getQuantity()-cartItem.getQuantity());
        }
    }
    public void Ship()
    {ArrayList<ShippedItem> shippedItems = new ArrayList<ShippedItem>();
        for (CartItem cartItem : cartItems) {
            if(cartItem.getProduct() instanceof Shipping) {
                ShippedProduct product = new ShippedProduct(cartItem.getProduct().getName(),cartItem.getQuantity()*cartItem.getQuantity());
                shippedItems.add(product);
            }
           this.shippingService= new ShippingService(shippedItems);

        }
        shippingService.ship();
    }
    public void checkout(double customerBalance) throws Exception {
        if(cartItems.length == 0){
            throw new Exception("No cart items found");
        }
        double total = calculateTotal();

        for (CartItem cartItem : cartItems) {
            if(cartItem.getProduct() instanceof Shipping) {
                total+=30;
                break;
            }
        }

        if (total > customerBalance) {
            throw new Exception("Not enough Balance");
        }
        Ship();
        AdjustQuantity();


        System.out.println("** Checkout receipt **");
        for ( CartItem  cartItem : cartItems ){
            System.out.println(cartItem);

        }


        System.out.println("-----------------------");
        System.out.println("SubTotal         "+ (total-30));
        System.out.println("Shipping         "+ 30);
        System.out.println("Amount           "+total);
        System.out.println("Current Balance  "+(customerBalance-total));
    }

}
