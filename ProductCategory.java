//TreeSet
import java.util.TreeSet;

public class ProductCategory{
    public static void main(String args[]){
        TreeSet<String> products = new TreeSet<>();
        products.add("Electronics");
        products.add("Scholastics");
        products.add("Clothing");
        products.add("Food");
        products.add("Decorations");

        System.out.println("Product Categories in Alphabetical Order: ");
        for( String product : products){
            System.out.println(product);
        }
    }
}