
// SmartDevice.java
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light.java
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

// AC.java
class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is turned ON.");
    }
    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

// TV.java
class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// MainSmartDevice.java
public class MainSmartDevice {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOff();
    }
}
