import java.util.Scanner;

public class StringToArray {
    public static char[] toCharArrayCustom(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] customArr = toCharArrayCustom(str);
        char[] builtInArr = str.toCharArray();

        System.out.println("Custom method result: ");
        for (char c : customArr) System.out.print(c + " ");

        System.out.println("\nBuilt-in method result: ");
        for (char c : builtInArr) System.out.print(c + " ");

        System.out.println("\nArrays equal? " + compareArrays(customArr, builtInArr));
    }
}

