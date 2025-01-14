//ArrayList
import java.util.ArrayList;

public class cart{  
    private ArrayList<String> cart;

    public cart(){
        cart = new ArrayList<>();
    }
    public void addItem(String item) {
        cart.add(item);
        System.out.println(item + " has been added to the cart.");
    }
    public void removeItem(String... items){
        for(String item : items){ 
        if(cart.contains(item)){
            cart.remove(item);
            System.out.println(item + " has been removed successfully.");
        }
        else{
            System.out.println(item + " is not found in the cart.");
        }
    }
    }
    public void displayItems(){
        if(cart.isEmpty()){
            System.out.println("The cart is empty!");
        }
        else{
            System.out.println("Items in the cart:");
            for (String item : cart) {
                System.out.println("- " + item);
                
            }
        }
        }
    
        public static void main (String args[]){
            cart cart = new cart();
            cart.addItem("Colgate");
            cart.addItem("Brush");
            cart.addItem("novel");
            cart.addItem("Book");
            cart.removeItem("Book", "novel");
            cart.displayItems();
        }
    
        }

