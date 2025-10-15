// Scenario 1: Payment Gateway Integration
interface PaymentProcessor {
    void processPayment(double amount);

    // New default method added without breaking existing classes
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default method).");
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Paytm.");
    }
}

class PhonePe implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via PhonePe.");
    }

    // Overriding default method
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed via PhonePe (custom).");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        paytm.processPayment(500);
        paytm.refund(200);

        PaymentProcessor phonePe = new PhonePe();
        phonePe.processPayment(1000);
        phonePe.refund(400);
    }
}