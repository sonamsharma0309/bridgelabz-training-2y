import java.util.*;

class Product {
    String name;
    int quantity;
    double pricePerUnit;

    Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    List<Product> products = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addProduct(String name, int qty, double price) {
        products.add(new Product(name, qty, price));
    }
}

class BillGenerator {
    static double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.products) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryBillApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        c1.addProduct("Apples", 2, 3);  // 2 kg @ $3/kg
        c1.addProduct("Milk", 1, 2);   // 1 liter @ $2/liter

        double bill = BillGenerator.generateBill(c1);

        System.out.println("Customer: " + c1.name);
        for (Product p : c1.products) {
            System.out.println(p.name + " -> " + p.quantity + " x $" + p.pricePerUnit + " = $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + bill);
    }
}

