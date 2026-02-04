public class MaxSubarraySum {
    // Kadane's algorithm: O(n)
    public static long maxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        long best = arr[0];
        long cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            best = Math.max(best, cur);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(a)); // 6 (4 + -1 + 2 + 1)
    }
}
