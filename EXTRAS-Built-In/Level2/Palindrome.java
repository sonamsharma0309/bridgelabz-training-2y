import java.util.*;
public class Palindrome {
    static boolean isPal(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(isPal(sc.next()));
    }
}
