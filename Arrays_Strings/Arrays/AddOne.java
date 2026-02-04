import java.util.Arrays;

public class AddOne {
    // Adds 1 to a number represented as an array of digits.
    // Example: [1,2,9] -> [1,3,0], [9,9] -> [1,0,0]
    public static int[] addOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
        }
        if (carry == 0) return digits;

        int[] res = new int[n + 1];
        res[0] = 1;
        // remaining already 0
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 9};
        System.out.println(Arrays.toString(addOne(a))); // [1, 3, 0]
        int[] b = {9, 9};
        System.out.println(Arrays.toString(addOne(b))); // [1, 0, 0]
    }
}
