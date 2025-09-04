import java.util.Scanner;

class NumberArrayAnalyzer {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (!isPositive(arr[i])) {
                System.out.println("Number " + arr[i] + " is Negative");
            } else {
                System.out.println("Number " + arr[i] + " is Positive");
                if (isEven(arr[i])) System.out.println("It is Even");
                else System.out.println("It is Odd");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and Last numbers are Equal");
        else if (result == 1) System.out.println("First number is Greater than Last");
        else System.out.println("First number is Less than Last");
    }
}
