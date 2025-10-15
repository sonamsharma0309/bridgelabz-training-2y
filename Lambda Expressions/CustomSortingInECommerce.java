import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}

public class CustomSortingInECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 70000, 4.6, 10),
            new Product("Phone", 40000, 4.8, 5),
            new Product("Tablet", 30000, 4.2, 20)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
