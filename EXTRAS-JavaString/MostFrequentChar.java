import java.util.*;

class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] f = new int[256];
        for (char c : s.toCharArray()) f[c]++;
        int max = 0; char ans = ' ';
        for (int i = 0; i < 256; i++) if (f[i] > max) { max = f[i]; ans = (char) i; }
        System.out.println("Most Frequent Character: " + ans);
    }
}
