import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Heart rate critical!"),
            new Alert("Info", "Patient temperature normal."),
            new Alert("Warning", "Medication delayed!")
        );

        Predicate<Alert> emergencyFilter = a -> a.type.equals("Emergency");
        Predicate<Alert> warningFilter = a -> a.type.equals("Warning");

        System.out.println("Emergency Alerts:");
        alerts.stream().filter(emergencyFilter).forEach(System.out::println);

        System.out.println("\nWarning Alerts:");
        alerts.stream().filter(warningFilter).forEach(System.out::println);
    }
}
