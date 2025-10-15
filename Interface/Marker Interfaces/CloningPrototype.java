// Scenario 2: Cloning Prototype Objects

class Prototype implements Cloneable {
    String model;
    int version;

    public Prototype(String model, int version) {
        this.model = model;
        this.version = version;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Prototype{model='" + model + "', version=" + version + "}";
    }
}

public class CloningPrototype {
    public static void main(String[] args) {
        try {
            Prototype original = new Prototype("AI_Model", 1);
            Prototype clone = (Prototype) original.clone();

            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}