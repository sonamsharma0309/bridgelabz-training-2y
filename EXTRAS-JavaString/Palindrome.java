import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(r));
    }
}
