//level 1 :- ques 15 and level 2 :- ques 5
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your height in cm: ");
        double cm = sc.nextDouble();

        // Conversion
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        // Output
        System.out.println("Your height is: " + feet + " feet and " + remainingInches + " inches");
    }
}

