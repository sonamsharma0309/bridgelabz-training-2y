import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        String[] pages = {"home", "about", "products", "home", "products", "contact", "home"};
        
        for (String p : pages)
            visits.put(p, visits.getOrDefault(p, 0) + 1);
        
        visits.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        
        String top = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most visited page: " + top);
    }
}