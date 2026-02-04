public class IPAddress {
    // IPv4 validation: 4 parts, 0-255, only digits, no leading zeros unless the part is exactly "0"
    public static boolean isValidIPv4(String ip) {
        if (ip == null) return false;
        ip = ip.trim();
        String[] parts = ip.split("\\.", -1); // keep empty parts
        if (parts.length != 4) return false;

        for (String p : parts) {
            if (p.length() == 0) return false;
            // no leading zeros like "01" (but allow "0")
            if (p.length() > 1 && p.charAt(0) == '0') return false;

            int val = 0;
            for (int i = 0; i < p.length(); i++) {
                char c = p.charAt(i);
                if (c < '0' || c > '9') return false;
                val = val * 10 + (c - '0');
                if (val > 255) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.1.1")); // true
        System.out.println(isValidIPv4("256.1.1.1"));   // false
        System.out.println(isValidIPv4("01.2.3.4"));    // false
    }
}
