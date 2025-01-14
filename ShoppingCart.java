//Iterator
import java.util.ArrayList;
import java.util.Iterator;

class CartItem {
    String name;
    double price;

    public CartItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Creating an ArrayList of cart items
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding items to the cart
        cart.add(new CartItem("Laptop", 1000));
        cart.add(new CartItem("Headphones", 50));
        cart.add(new CartItem("Mouse", 25));
        cart.add(new CartItem("Keyboard", 75));
        cart.add(new CartItem("Notebook", 5));

        // Setting the price threshold
        double priceThreshold = 50.0;

        // Using an Iterator to traverse and remove items below the threshold
        Iterator<CartItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.price < priceThreshold) {
                iterator.remove(); // Safely removes the item during iteration
            }
        }

        // Displaying the remaining items in the cart
        System.out.println("Cart items above $" + priceThreshold + ":");
        for (CartItem item : cart) {
            System.out.println(item);
        }
    }
}

