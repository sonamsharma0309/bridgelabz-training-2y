//level 1 :- ques 14 and level 2 :- ques 4
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Conversion
        double yards = feet / 3;      // 1 yard = 3 feet
        double miles = feet / 5280;   // 1 mile = 5280 feet

        // Output
        System.out.println("Distance in Yards: " + yards);
        System.out.println("Distance in Miles: " + miles);
    }
}

