import java.util.*;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 55000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1000.0);
        
        System.out.println("Items in cart:");
        for (Map.Entry<String, Double> e : cart.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
        
        double total = cart.values().stream().mapToDouble(d -> d).sum();
        if (total > 5000) total *= 0.9;
        System.out.println("Total after discount (if any): " + total);
    }
}