class Product {
    private static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Qty: " + quantity + ", ID: " + productID + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2, 301);
        Product p2 = new Product("Phone", 20000, 5, 302);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.updateDiscount(15);
    }
}
