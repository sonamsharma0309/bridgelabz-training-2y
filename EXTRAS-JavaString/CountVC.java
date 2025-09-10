import java.util.*;

class CountVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray())
            if ("aeiou".indexOf(ch) >= 0) v++;
            else if (Character.isLetter(ch)) c++;
        System.out.println("Vowels=" + v + " Consonants=" + c);
    }
}
