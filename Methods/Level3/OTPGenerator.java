import java.util.*;

class OTPGenerator {
    public static String generateOTP() {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000); // 6-digit OTP
        return String.valueOf(otp);
    }

    public static boolean validateUniqueOTPs() {
        Set<String> otps = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String otp = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otp);
            if (!otps.add(otp)) return false; // duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        boolean unique = validateUniqueOTPs();
        System.out.println("All OTPs unique: " + unique);
    }
}
