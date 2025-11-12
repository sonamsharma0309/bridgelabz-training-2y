import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apples", 50);
        stock.put("Bananas", 30);
        stock.put("Mangoes", 20);
        
        // Customer buys
        stock.put("Apples", stock.get("Apples") - 45);
        
        // Remove out-of-stock items
        stock.entrySet().removeIf(e -> e.getValue() <= 0);
        
        // New shipment
        stock.put("Mangoes", stock.get("Mangoes") + 40);
        
        // Query
        System.out.println("Bananas in stock: " + stock.getOrDefault("Bananas", 0));
        
        // Print out of stock items
        System.out.println("Out of stock items:");
        for (String item : List.of("Apples", "Bananas", "Mangoes"))
            if (!stock.containsKey(item) || stock.get(item) <= 0)
                System.out.println(item);
    }
}