class NumberChecker3 {
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static boolean isDuck(int num) {
        return String.valueOf(num).contains("0");
    }

    public static void main(String[] args) {
        int num = 12321;

        System.out.println("Palindrome Number: " + isPalindrome(num));
        System.out.println("Duck Number: " + isDuck(num));
    }
}

