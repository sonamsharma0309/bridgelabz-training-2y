import java.util.Scanner;

public class ToUpperCaseDemo {
    public static String toUpperCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // ASCII difference
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upperCustom = toUpperCaseCustom(str);
        String upperBuiltIn = str.toUpperCase();

        System.out.println("Custom Uppercase: " + upperCustom);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Are they equal? " + compareUsingCharAt(upperCustom, upperBuiltIn));
    }
}

