import java.util.Scanner;

class SumNaturalNumbers {
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
    }
}

