import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        // Start index > End index → IllegalArgumentException
        String sub = text.substring(5, 2);
        System.out.println(sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
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

