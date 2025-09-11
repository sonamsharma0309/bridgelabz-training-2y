import java.util.*;
public class Factorial {
    static long fact(int n){return n<=1?1:n*fact(n-1);}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
    }
}
