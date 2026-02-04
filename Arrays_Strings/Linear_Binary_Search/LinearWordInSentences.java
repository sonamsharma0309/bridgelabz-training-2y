public class LinearWordInSentences {
    // Returns first sentence containing the word (whole-word match), else "Not Found"
    public static String firstSentenceContaining(String[] sentences, String word) {
        if (sentences == null || word == null) return "Not Found";
        String w = word.trim();
        if (w.isEmpty()) return "Not Found";

        for (String s : sentences) {
            if (s == null) continue;
            if (containsWholeWord(s, w)) return s;
        }
        return "Not Found";
    }

    private static boolean containsWholeWord(String sentence, String word) {
        // Split by non-letter/digit to avoid partial matches like "cat" in "catch"
        String[] tokens = sentence.split("[^A-Za-z0-9]+");
        for (String t : tokens) {
            if (t.equals(word)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] s = {"I love apples", "Java is fun", "Search this line"};
        System.out.println(firstSentenceContaining(s, "Java")); // Java is fun
    }
}
