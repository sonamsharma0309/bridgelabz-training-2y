import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC1001", 10000.0);
        accounts.put("ACC1002", 25000.0);
        accounts.put("ACC1003", 18000.0);
        accounts.put("ACC1004", 5000.0);
        
        // Deposit & Withdraw
        accounts.put("ACC1001", accounts.get("ACC1001") + 5000);
        double withdrawAmt = 7000;
        if (accounts.get("ACC1004") >= withdrawAmt)
            accounts.put("ACC1004", accounts.get("ACC1004") - withdrawAmt);
        else
            System.out.println("Insufficient funds for ACC1004");
        
        // Sort by descending balance
        accounts.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        
        System.out.println("Top 3 Customers:");
        accounts.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}