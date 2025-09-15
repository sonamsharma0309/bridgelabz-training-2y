// 4. Program to Handle Mobile Phone Details
class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "Galaxy S23", 80000);
        m.display();
    }
}
