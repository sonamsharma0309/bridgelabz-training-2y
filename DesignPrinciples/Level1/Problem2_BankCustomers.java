
// Problem 2: Bank and Account Holders (Association)
import java.util.*;

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() { return name; }

    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.getName() + " in " + name);
    }
}

public class Problem2_BankCustomers {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.deposit(500);
        c2.deposit(1000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
