import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 70000.0);
        salaries.put("Bob", 85000.0);
        salaries.put("Charlie", 95000.0);
        salaries.put("David", 50000.0);
        salaries.put("Eve", 88000.0);
        salaries.put("Frank", 95000.0);
        
        salaries.put("Alice", salaries.get("Alice") * 1.10);
        
        double avg = salaries.values().stream().mapToDouble(d -> d).average().orElse(0);
        System.out.println("Average salary: " + avg);
        
        double max = Collections.max(salaries.values());
        System.out.println("Highest paid employees:");
        for (Map.Entry<String, Double> e : salaries.entrySet())
            if (e.getValue() == max)
                System.out.println(e.getKey() + " -> " + e.getValue());
    }
}