import java.util.Scanner;

public class ToLowerCaseDemo {
    public static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // ASCII difference
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

        String lowerCustom = toLowerCaseCustom(str);
        String lowerBuiltIn = str.toLowerCase();

        System.out.println("Custom Lowercase: " + lowerCustom);
        System.out.println("Built-in Lowercase: " + lowerBuiltIn);
        System.out.println("Are they equal? " + compareUsingCharAt(lowerCustom, lowerBuiltIn));
    }
}

