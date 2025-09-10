import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] findShortestLongest(String str) {
        String[] words = str.split(" ");
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] res = findShortestLongest(str);
        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
}

