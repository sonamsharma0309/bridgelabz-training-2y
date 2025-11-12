import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();
        
        results.put("Maths", Map.of("Alice", 95, "Bob", 80, "Charlie", 89));
        results.put("Science", Map.of("Alice", 75, "Bob", 92, "Charlie", 88));
        results.put("English", Map.of("Alice", 85, "Bob", 78, "Charlie", 91));
        
        for (String subject : results.keySet()) {
            Map<String, Integer> marks = results.get(subject);
            String topper = Collections.max(marks.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println(subject + " Topper: " + topper);
            
            double avg = marks.values().stream().mapToInt(i -> i).average().orElse(0);
            System.out.println("Average in " + subject + ": " + avg);
        }
        
        System.out.println("Subjects with at least one score > 90:");
        for (Map.Entry<String, Map<String, Integer>> e : results.entrySet()) {
            if (e.getValue().values().stream().anyMatch(v -> v > 90))
                System.out.println(e.getKey());
        }
    }
}