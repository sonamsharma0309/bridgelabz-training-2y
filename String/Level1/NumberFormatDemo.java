import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);  // Will throw NumberFormatException
        System.out.println("Number is: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (Exception e) {
            System.out.println("Caught generic Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Uncomment to generate runtime crash
        // generateException(str);

        // Handle properly
        handleException(str);
    }
}

