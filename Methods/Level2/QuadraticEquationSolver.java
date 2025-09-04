import java.util.Scanner;

class QuadraticEquationSolver {
    public static String findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Two Real Roots: " + root1 + " and " + root2;
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return "One Real Root: " + root;
        } else {
            return "No Real Roots (Delta < 0)";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        System.out.println(findRoots(a, b, c));
    }
}
