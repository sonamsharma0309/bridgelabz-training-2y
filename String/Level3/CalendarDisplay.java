import java.util.*;

class CalendarDisplay {
    static String[] months = {"", "January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        if (m == 2 && isLeap(y)) days[m] = 29;
        System.out.println("   " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int d = dayOfWeek(1, m, y);
        for (int i = 0; i < d; i++) System.out.print("    ");
        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%3d ", i);
            if ((i + d) % 7 == 0) System.out.println();
        }
    }
}
