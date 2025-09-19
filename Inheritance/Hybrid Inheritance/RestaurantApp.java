interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is preparing meals.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving customers.");
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101);
        Worker waiter = new Waiter("Bob", 202);

        chef.performDuties();
        waiter.performDuties();
    }
}

