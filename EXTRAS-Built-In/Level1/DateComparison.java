import java.time.*;
public class DateComparison {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.of(2025,9,10),d2=LocalDate.of(2025,9,11);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));
    }
}

