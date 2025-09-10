import java.util.*;

class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] f = new int[256];
        for (char c : a.toCharArray()) f[c]++;
        for (char c : b.toCharArray()) f[c]--;
        for (int x : f) if (x != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(isAnagram(a, b));
    }
}

