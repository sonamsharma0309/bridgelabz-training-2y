class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);
        FoodItem[] order = {f1, f2};
        double total=0;
        for (FoodItem f : order) {
            f.getItemDetails();
            double price = f.calculateTotalPrice();
            System.out.println("Total for item: " + price);
            total += price;
            System.out.println("--------------");
        }
        System.out.println("Order Total: " + total);
    }
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity){ this.itemName = itemName; this.price = price; this.quantity = quantity; }
    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }
    public void setQuantity(int q){ this.quantity = q; }
    public void getItemDetails(){ System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity); }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty){ super(name,price,qty); }
    @Override public double calculateTotalPrice(){ double base = getPrice()*getQuantity(); double disc = applyDiscount(); return base - disc; }
    @Override public double applyDiscount(){ return getPrice()*getQuantity()*0.05; } // 5% veg discount
    @Override public String getDiscountDetails(){ return "5% veg discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty){ super(name,price,qty); }
    @Override public double calculateTotalPrice(){ double base = getPrice()*getQuantity(); double addon = 20*getQuantity(); double disc = applyDiscount(); return base + addon - disc; }
    @Override public double applyDiscount(){ return getPrice()*getQuantity()*0.02; } // 2% discount
    @Override public String getDiscountDetails(){ return "2% non-veg discount + Rs.20 extra per item"; }
}
