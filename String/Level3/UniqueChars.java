import java.util.*;

class UniqueChars {
    static char[] findUnique(String s) {
        String u = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (u.indexOf(c) == -1) u += c;
        }
        return u.toCharArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] res = findUnique(s);
        for (char c : res) System.out.print(c + " ");
    }
}
