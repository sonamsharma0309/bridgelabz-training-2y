import java.util.Scanner;

public class StringLength {
    public static int lengthUsingCharAt(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Length (custom): " + lengthUsingCharAt(str));
        System.out.println("Length (built-in): " + str.length());
    }
}

