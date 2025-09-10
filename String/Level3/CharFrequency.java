import java.util.*;

class CharFrequency {
    static void findFreq(String s) {
        int[] f = new int[256];
        for (char c : s.toCharArray()) f[c]++;
        for (int i = 0; i < 256; i++) if (f[i] > 0) System.out.println((char) i + " : " + f[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findFreq(s);
    }
}

