import java.util.HashMap;
import java.util.Map;

public class FrequencyCheckWords {
    // Word frequency (case-insensitive). Splits by whitespace.
    public static Map<String, Integer> wordFrequency(String sentence) {
        Map<String, Integer> freq = new HashMap<>();
        if (sentence == null) return freq;

        String[] words = sentence.trim().split("\\s+");
        if (words.length == 1 && words[0].isEmpty()) return freq;

        for (String w : words) {
            String key = w.toLowerCase();
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println(wordFrequency("Hi hi Hello")); // {hi=2, hello=1}
    }
}
