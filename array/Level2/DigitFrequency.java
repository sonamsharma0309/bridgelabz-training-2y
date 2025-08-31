import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // b. Count digits
        String numStr = String.valueOf(number);
        int len = numStr.length();

        int[] digits = new int[len];
        int[] freq = new int[10];

        // c. Store digits in array
        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // d. Frequency count
        for (int d : digits) {
            freq[d]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
    }
}

