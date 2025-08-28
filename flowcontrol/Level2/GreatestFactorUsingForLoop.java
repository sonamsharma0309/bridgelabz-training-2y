package flowcontrol.Level2;
import java.util.Scanner;
public class GreatestFactorUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("No factor besides itself");
            return;
        }
        int greatestFactor = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest Factor: " + greatestFactor);
    }
}

