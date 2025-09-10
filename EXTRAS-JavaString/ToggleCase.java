import java.util.*;

class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), r = "";
        for (char c : s.toCharArray())
            r += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        System.out.println(r);
    }
}

