//level 1 :- ques 13 and level 2 :- ques 3
import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        // Formula
        double side = perimeter / 4;

        // Output
        System.out.println("Length of one side of Square: " + side);
    }
}

