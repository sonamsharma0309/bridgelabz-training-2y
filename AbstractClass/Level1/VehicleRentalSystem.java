class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("KA01AB1234", 2000);
        Vehicle v2 = new Bike("KA02XY9876", 500);
        Vehicle v3 = new Truck("KA03TR0001", 5000);

        Vehicle[] fleet = {v1, v2, v3};
        for (Vehicle v : fleet) {
            System.out.println(v.getVehicleNumber() + " -> Rental for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
            }
            System.out.println("-----------------");
        }
    }
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }
    public String getVehicleNumber(){ return vehicleNumber; }
    public String getType(){ return type; }
    public double getRentalRate(){ return rentalRate; }
    public void setRentalRate(double r){ this.rentalRate = r; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 1000; }
    @Override public String getInsuranceDetails(){ return "Comprehensive Insurance"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days*0.8; } // cheaper
    @Override public double calculateInsurance() { return 300; }
    @Override public String getInsuranceDetails(){ return "Third-party"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days*1.5; }
    @Override public double calculateInsurance() { return 2000; }
    @Override public String getInsuranceDetails(){ return "Goods carriage insurance"; }
}
