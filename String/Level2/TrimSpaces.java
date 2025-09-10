import java.util.Scanner;

public class TrimSpaces {
    public static String trimUsingCharAt(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return (start <= end) ? str.substring(start, end + 1) : "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String custom = trimUsingCharAt(str);
        String builtIn = str.trim();
        System.out.println("Custom: [" + custom + "]");
        System.out.println("Built-in: [" + builtIn + "]");
        System.out.println("Equal? " + custom.equals(builtIn));
    }
}

