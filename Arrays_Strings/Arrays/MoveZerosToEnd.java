import java.util.Arrays;

public class MoveZerosToEnd {
    // Stable move: keeps non-zero order same. O(n), in-place.
    public static void moveZerosToEnd(int[] arr) {
        int write = 0;
        for (int x : arr) {
            if (x != 0) arr[write++] = x;
        }
        while (write < arr.length) arr[write++] = 0;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZerosToEnd(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
}
