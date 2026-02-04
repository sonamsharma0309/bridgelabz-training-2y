public class LinearFirstNegative {
    // Returns index of first negative element, else -1
    public static int firstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, -7, 5};
        System.out.println(firstNegativeIndex(a)); // 2
    }
}
