import java.util.*;

class FirstNonRepeating {
    static char findChar(String s) {
        int[] f = new int[256];
        for (char c : s.toCharArray()) f[c]++;
        for (char c : s.toCharArray()) if (f[c] == 1) return c;
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ans = findChar(s);
        System.out.println(ans == '\0' ? "None" : ans);
    }
}

