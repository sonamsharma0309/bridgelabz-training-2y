public class BSPeakElement {
    // Returns index of any peak element. Works for n>=1.
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // compare mid with mid+1
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println(findPeak(a)); // 2 (value 3)
    }
}
