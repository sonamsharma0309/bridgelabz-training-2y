import java.util.*;

class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String max = "";
        for (String w : words) if (w.length() > max.length()) max = w;
        System.out.println(max);
    }
}
