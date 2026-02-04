import java.util.HashSet;

public class SBRemoveDuplicates {
    // Remove duplicate characters while maintaining order
    public static String removeDuplicates(String s) {
        if (s == null) return null;
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("banana")); // ban
    }
}
