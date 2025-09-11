import java.time.*;
public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println(now.withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println(now.withZoneSameInstant(ZoneId.of("Asia/Kolkata")));
        System.out.println(now.withZoneSameInstant(ZoneId.of("America/Los_Angeles")));
    }
}
