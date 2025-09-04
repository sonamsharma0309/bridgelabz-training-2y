import java.util.Scanner;

class SmallestLargestOfThree {
    static int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Smallest number: " + smallest(a, b, c));
        System.out.println("Largest number: " + largest(a, b, c));
    }
}

