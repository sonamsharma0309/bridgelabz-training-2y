// 10. Kilometer to Meter Conversion
import java.util.Scanner;

public class KilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double meters = kilometers * 1000;
        System.out.println("Distance in meters: " + meters);

        sc.close();
    }
}
