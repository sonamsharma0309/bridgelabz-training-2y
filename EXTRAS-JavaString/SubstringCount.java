import java.util.*;

class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), sub = sc.nextLine();
        int count = 0, i = 0;
        while ((i = s.indexOf(sub, i)) != -1) {
            count++;
            i += sub.length();
        }
        System.out.println(count);
    }
}
