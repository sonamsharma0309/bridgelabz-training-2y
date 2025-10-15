// Scenario 3: Sensitive Data Tagging

// Custom marker interface
interface SensitiveData {}

// Class marked as sensitive
class CreditCardInfo implements SensitiveData {
    String cardNumber;
    String holderName;

    public CreditCardInfo(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        CreditCardInfo card = new CreditCardInfo("1234-5678-9012-3456", "Sonam Sharma");

        if (card instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Applying encryption...");
        } else {
            System.out.println("No encryption required.");
        }
    }
}