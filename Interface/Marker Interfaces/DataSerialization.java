// Scenario 1: Data Serialization for Backup

import java.io.*;

class UserData implements Serializable {
    private String name;
    private int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "UserData{name='" + name + "', age=" + age + "}";
    }
}

public class DataSerialization {
    public static void main(String[] args) {
        UserData user = new UserData("Sonam", 22);
        String filename = "userdata.ser";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(user);
            System.out.println("Data serialized for backup successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            UserData restoredUser = (UserData) in.readObject();
            System.out.println("Restored from backup: " + restoredUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}