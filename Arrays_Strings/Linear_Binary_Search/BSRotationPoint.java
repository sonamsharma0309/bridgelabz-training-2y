public class BSRotationPoint {
    // Returns index of smallest element (rotation point) in rotated sorted array (no duplicates assumed)
    public static int rotationPoint(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotationPoint(a)); // 4
    }
}
