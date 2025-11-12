import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington DC");
        capitals.put("UK", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("China", "Beijing");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");
        
        String country = "India";
        System.out.println("Capital of " + country + ": " + capitals.getOrDefault(country, "Unknown country"));
        
        System.out.println("All countries:");
        for (Map.Entry<String, String> e : capitals.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}