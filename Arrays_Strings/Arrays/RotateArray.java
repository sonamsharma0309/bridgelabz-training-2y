import java.util.Arrays;

public class RotateArray {
    // Right rotate by k steps using reversal. O(n), in-place.
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k %= n;
        if (k < 0) k += n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rotateRight(a, 3);
        System.out.println(Arrays.toString(a)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
