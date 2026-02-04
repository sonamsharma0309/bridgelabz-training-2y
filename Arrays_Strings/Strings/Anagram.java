import java.util.Arrays;

public class Anagram {
    // Anagram check ignoring spaces and case. Keeps only letters/digits.
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        String a = normalize(s1);
        String b = normalize(s2);
        if (a.length() != b.length()) return false;

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    private static String normalize(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
