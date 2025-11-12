import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        Map<String, Integer> freq = new HashMap<>();
        
        for (String word : sentence.toLowerCase().split(" ")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}