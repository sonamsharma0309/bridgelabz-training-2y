class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("SB1001", "Ravi", 20000, 0.04);
        BankAccount a2 = new CurrentAccount("CA2001", "Neha", 50000);

        BankAccount[] accounts = {a1, a2};
        for (BankAccount a : accounts) {
            a.displayDetails();
            System.out.println("Interest: " + a.calculateInterest());
            System.out.println("-----------------");
        }
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance;
    }
    public String getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }
    public void deposit(double amt){ balance += amt; }
    public boolean withdraw(double amt){ if (amt<=balance){ balance-=amt; return true;} return false; }
    public abstract double calculateInterest();
    public void displayDetails(){ System.out.println("AccNo: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance); }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    public SavingsAccount(String acc, String name, double balance, double rate) {
        super(acc, name, balance); this.interestRate = rate;
    }
    @Override public double calculateInterest() { return getBalance()*interestRate; }
    @Override public void applyForLoan(double amount) { System.out.println("Applying loan for: " + amount); }
    @Override public boolean calculateLoanEligibility(double amount) { return getBalance() > amount*0.1; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double balance) { super(acc, name, balance); }
    @Override public double calculateInterest() { return 0; } // no interest
}
