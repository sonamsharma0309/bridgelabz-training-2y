public class Panagram {
    // Pangram: contains every letter a-z at least once (case-insensitive)
    public static boolean isPangram(String s) {
        if (s == null) return false;
        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                    if (count == 26) return true;
                }
            }
        }
        return count == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true
        System.out.println(isPangram("hello world")); // false
    }
}
