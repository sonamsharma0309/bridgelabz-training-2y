import java.util.*;

class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char r = sc.next().charAt(0);
        String res = "";
        for (char c : s.toCharArray()) if (c != r) res += c;
        System.out.println("Modified String: " + res);
    }
}
