class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term; // in months

    FixedDepositAccount(int accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Term: " + term + " months");
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, 5000, 4.5);
        BankAccount acc2 = new CheckingAccount(102, 8000, 2000);
        BankAccount acc3 = new FixedDepositAccount(103, 15000, 12);

        acc1.displayAccountType();
        acc2.displayAccountType();
        acc3.displayAccountType();
    }
}
