import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break; // Limit 10 elements

            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break; // Stop if 0 or negative
            }

            arr[index] = num;
            index++;
        }

        // Sum all numbers
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        // Display numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal sum = " + total);
    }
}
