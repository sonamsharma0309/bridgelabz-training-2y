
// SecurityUtils.java
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

// PasswordValidatorDemo.java
public class PasswordValidatorDemo {
    public static void main(String[] args) {
        String password = "Abc@1234";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password: " + password);
        } else {
            System.out.println("Weak password: " + password);
        }
    }
}
