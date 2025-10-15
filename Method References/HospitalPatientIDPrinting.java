import java.util.*;

public class HospitalPatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103", "P104");
        System.out.println("Patient IDs:");
        patientIDs.forEach(System.out::println); // Method reference instead of lambda
    }
}
