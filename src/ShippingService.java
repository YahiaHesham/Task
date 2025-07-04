import java.util.ArrayList;

public class ShippingService {

    ArrayList<ShippedItem> shippedItems;

    public ShippingService(ArrayList<ShippedItem> shippedItems) {
        this.shippedItems = shippedItems;
    }

    public void ship(){
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for(ShippedItem shippedItem : shippedItems){
            System.out.println(shippedItem.getName()+" "+shippedItem.getWeight());
            totalWeight += shippedItem.getWeight();
        }
        if(totalWeight > 1000){
            totalWeight=totalWeight/1000;
            System.out.println("Total Package weight is " + totalWeight+" Kg");
        }
        else {
            System.out.println("Total Package weight is " + totalWeight+" grams");
        }

    }
}
