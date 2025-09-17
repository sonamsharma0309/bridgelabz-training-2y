class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 60000, 10);
        Product p2 = new Clothing(202, "Jeans", 1500, 0.10); // 10% discount base
        Product p3 = new Groceries(203, "Rice", 80, 2); // 2 kg

        Product[] products = {p1, p2, p3};
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " -> Price: " + p.getPrice() + ", Tax: " + tax + ", Discount: " + discount + ", Final: " + finalPrice);
        }
    }
}

abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }
    public int getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public void setPrice(double price){ this.price = price; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyYears;
    public Electronics(int id, String name, double price, double warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% electronics discount
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }
    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    private double discountRate;
    public Clothing(int id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }
    @Override
    public double calculateDiscount() { return getPrice() * discountRate; }
    @Override
    public double calculateTax() { return getPrice() * 0.05; } // 5% tax
    @Override
    public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    private double weightKg;
    public Groceries(int id, String name, double price, double weightKg) {
        super(id, name, price);
        this.weightKg = weightKg;
    }
    @Override
    public double calculateDiscount() { return 0; /* no discount */ }
}
