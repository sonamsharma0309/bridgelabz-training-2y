import java.util.*;

class UniqueCharFrequency {
    static char[] unique(String s) {
        String u = "";
        for (int i = 0; i < s.length(); i++) if (u.indexOf(s.charAt(i)) == -1) u += s.charAt(i);
        return u.toCharArray();
    }

    static void freq(String s) {
        char[] u = unique(s);
        for (char c : u) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) count++;
            System.out.println(c + " : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        freq(s);
    }
}

