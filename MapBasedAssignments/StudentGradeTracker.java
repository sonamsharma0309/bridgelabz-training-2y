import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Alice", 85.0);
        grades.put("Bob", 90.0);
        grades.put("Charlie", 78.0);
        
        // Update grade
        grades.put("Alice", 88.0);
        
        // Remove a student
        grades.remove("Charlie");
        
        // Print all in alphabetical order
        for (Map.Entry<String, Double> e : grades.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}