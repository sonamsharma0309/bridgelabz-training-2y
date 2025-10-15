
// Payment.java
interface Payment {
    void pay(double amount);
}

// UPI.java
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

// CreditCard.java
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

// Wallet.java
class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Wallet.");
    }
}

// MainPayment.java
public class MainPayment {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
