//level 1 :- ques 12 and level 2 :- ques 2
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // Formula
        double area = 0.5 * base * height;

        // Output
        System.out.println("Area of Triangle: " + area + " square units");
    }
}

