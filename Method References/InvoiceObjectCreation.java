import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionID;

    Invoice(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public String toString() {
        return "Invoice created for Transaction ID: " + transactionID;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIDs = Arrays.asList("T1001", "T1002", "T1003");

        // Constructor reference used here
        List<Invoice> invoices = transactionIDs.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
