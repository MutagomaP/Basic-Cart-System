//priority queue
import java.util.*;

class Customer {
    String name;
    String membershipLevel;

    public Customer(String name, String membershipLevel) {
        this.name = name;
        this.membershipLevel = membershipLevel;
    }

    @Override
    public String toString() {
        return name + " (" + membershipLevel + ")";
    }
}
class CustomerPriorityComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        
        if (c1.membershipLevel.equals("VIP") && !c2.membershipLevel.equals("VIP")) {
            return -1;  
        } else if (!c1.membershipLevel.equals("VIP") && c2.membershipLevel.equals("VIP")) {
            return 1;  
        }
        return 0; 
    }
}

public class CheckoutSystem {
    public static void main(String[] args) {
        PriorityQueue<Customer> checkoutQueue = new PriorityQueue<>(new CustomerPriorityComparator());
        checkoutQueue.add(new Customer("Alice", "VIP"));
        checkoutQueue.add(new Customer("Bob", "Regular"));
        checkoutQueue.add(new Customer("Charlie", "VIP"));
        checkoutQueue.add(new Customer("Dave", "Regular"));

        
        System.out.println("Processing customers in order:");
        while (!checkoutQueue.isEmpty()) {
            Customer customer = checkoutQueue.poll(); 
            System.out.println("Processing customer: " + customer);
        }
    }
}
