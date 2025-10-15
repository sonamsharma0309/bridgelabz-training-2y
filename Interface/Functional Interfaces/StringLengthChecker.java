
// StringLengthChecker.java
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();

        String message = "This is a sample message.";
        int limit = 20;

        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit! (" + length + " characters)");
        } else {
            System.out.println("Message is within limit. (" + length + " characters)");
        }
    }
}
