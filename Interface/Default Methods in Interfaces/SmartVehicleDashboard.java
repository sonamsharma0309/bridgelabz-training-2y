// Scenario 3: Smart Vehicle Dashboard
interface Vehicle {
    void displaySpeed();

    // Default method for new feature
    default void displayBattery() {
        System.out.println("Battery status not available for this vehicle.");
    }
}

class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Petrol car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 100 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery percentage: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle petrol = new PetrolCar();
        petrol.displaySpeed();
        petrol.displayBattery();

        Vehicle electric = new ElectricCar();
        electric.displaySpeed();
        electric.displayBattery();
    }
}