// 3. Program to Track Inventory of Items
class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display(int quantity) {
        System.out.println("Code: " + itemCode + ", Name: " + itemName + ", Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Pen", 10);
        i.display(5);
    }
}
