import java.time.*;
import java.time.format.*;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate t=LocalDate.now();
        System.out.println(t.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(t.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(t.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}

