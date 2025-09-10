import java.util.*;

class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        int n = Math.min(a.length(), b.length()), cmp = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cmp = a.charAt(i) - b.charAt(i);
                break;
            }
        }
        if (cmp == 0) cmp = a.length() - b.length();
        if (cmp < 0) System.out.println(a + " comes before " + b);
        else if (cmp > 0) System.out.println(b + " comes before " + a);
        else System.out.println("Both strings are equal");
    }
}
