
package com.example.generics;
import java.util.*;
public class Main {
    public static void main(String[] args){
        // 1 Box
        Box<Integer> b1 = new Box<>(); b1.set(100);
        Box<String> b2 = new Box<>(); b2.set("Hello");
        Box<Double> b3 = new Box<>(); b3.set(3.14);
        System.out.println("Box values: " + b1.get() + ", " + b2.get() + ", " + b3.get());
        // 2 Pair
        Pair<String,Integer> student = new Pair<>("Amol", 20);
        System.out.println("Pair: " + student.getFirst() + ", " + student.getSecond());
        // 3 isEqual
        System.out.println("isEqual: " + Utils.isEqual(5,5) + ", " + Utils.isEqual("a","b"));
        // 4 maximum
        System.out.println("Maximum: " + Utils.maximum(3,7,5));
        System.out.println("Maximum String: " + Utils.maximum("A","Z","M"));
        // 5 FruitBox
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple("RedDel"));
        apples.display();
        // 6 sumNumbers
        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.5,2.5);
        System.out.println("Sum ints: " + Utils.sumNumbers(ints));
        System.out.println("Sum doubles: " + Utils.sumNumbers(doubles));
        // 7 copyList
        List<Number> dest = new ArrayList<>();
        Utils.copyList(dest, ints);
        Utils.copyList(dest, doubles);
        System.out.println("Copied to dest: " + dest);
        // 8 printAnimals
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Max"));
        Utils.printAnimals(dogs);
        // 9 Cart
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Phone");
        electronicsCart.displayItems();
        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("Shirt");
        clothesCart.displayItems();
        // 10 Price Calculator
        List<Mobile> mobiles = Arrays.asList(new Mobile("M1", 10000), new Mobile("M2", 15000));
        System.out.println("Total mobiles: " + Utils.calculateTotal(new ArrayList<Product>(mobiles)));
        // 11 FleetManager
        FleetManager<Truck> fm = new FleetManager<>();
        fm.addVehicle(new Truck("T-01")); fm.showFleet();
        FleetManager<Bike> fmb = new FleetManager<>();
        fmb.addVehicle(new Bike("B-01")); fmb.showFleet();
        // 12 Storage
        Storage<Electronics> s = new Storage<>();
        s.add(new Electronics("TV")); Storage.displayAll(s.getItems());
        // 13 Marketplace
        Marketplace.applyDiscount(mobiles.get(0), 10.0);
        // 14 Course
        Course<ExamCourse> c = new Course<>();
        c.add(new ExamCourse("Calculus")); c.show();
        // 15 Meal
        Meal<VegetarianMeal> meal = new Meal<>();
        meal.add(new VegetarianMeal("Veg Thali")); meal.show();
        // 16 Resume
        Resume<SoftwareEngineer> r = new Resume<>(new SoftwareEngineer("Backend SE")); r.process();
        Resume.processAll(Arrays.asList(new SoftwareEngineer("SWE1")));
    }
}
