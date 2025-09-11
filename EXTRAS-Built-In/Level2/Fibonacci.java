import java.util.*;
public class Fibonacci {
    static void fib(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int t=a+b;a=b;b=t;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fib(sc.nextInt());
    }
}

