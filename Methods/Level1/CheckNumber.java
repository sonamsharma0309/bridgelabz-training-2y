import java.util.Scanner;

class CheckNumber {
    static int check(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = check(n);
        System.out.println("Result: " + result);
    }
}

