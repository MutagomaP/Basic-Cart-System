//HashMap
import java.util.HashMap;
public class itemPrices{
    public static void main (String args[]){
        //Inserting values and key
        HashMap<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Book", 2.09);
        itemPrices.put("Brush", 0.99 );
        itemPrices.put("Novel", 20.99);

        double totalCost = 0.00;
        for(double price : itemPrices.values()){
            totalCost += price;
        }
        System.out.println("Total cost of all items in the cart: $ " +totalCost);
    }
}