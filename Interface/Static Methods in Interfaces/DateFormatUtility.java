
// DateFormatter.java
import java.text.SimpleDateFormat;
import java.util.Date;

interface DateFormatter {
    static String formatDate(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
}

// DateFormatterDemo.java
import java.util.Date;

public class DateFormatterDemo {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Default format: " + DateFormatter.formatDate(now, "dd-MM-yyyy"));
        System.out.println("Full format: " + DateFormatter.formatDate(now, "EEEE, MMMM dd, yyyy"));
        System.out.println("Time only: " + DateFormatter.formatDate(now, "HH:mm:ss"));
    }
}
