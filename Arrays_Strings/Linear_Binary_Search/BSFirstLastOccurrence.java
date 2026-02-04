import java.util.Arrays;

public class BSFirstLastOccurrence {
    public static int[] firstAndLast(int[] arr, int target) {
        int first = firstIndex(arr, target);
        int last = lastIndex(arr, target);
        return new int[]{first, last};
    }

    private static int firstIndex(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static int lastIndex(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 4};
        System.out.println(Arrays.toString(firstAndLast(a, 2))); // [1, 3]
        System.out.println(Arrays.toString(firstAndLast(a, 5))); // [-1, -1]
    }
}
