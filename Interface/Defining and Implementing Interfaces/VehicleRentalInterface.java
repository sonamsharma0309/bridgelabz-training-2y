
// Vehicle.java
interface Vehicle {
    void rent();
    void returnVehicle();
}

// Car.java
class Car implements Vehicle {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

// Bike.java
class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

// Bus.java
class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

// MainVehicle.java
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.returnVehicle();
        bus.rent();
    }
}
