import java.time.*;
public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2025,9,11);
        d=d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(d);
    }
}
