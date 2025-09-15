import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    static ArrayList<CartItem> cart = new ArrayList<>();

    static void addItem(CartItem item) {
        cart.add(item);
    }

    static void removeItem(String name) {
        cart.removeIf(i -> i.itemName.equalsIgnoreCase(name));
    }

    static void displayTotal() {
        double total = 0;
        for (CartItem i : cart) total += i.price * i.quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem.addItem(new CartItem("Book", 200, 2));
        CartItem.addItem(new CartItem("Pen", 10, 5));
        CartItem.displayTotal();
        CartItem.removeItem("Pen");
        CartItem.displayTotal();
    }
}