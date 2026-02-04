public class ProductOf2DArray {
    // Returns product of all elements. Uses long; may overflow if numbers are large.
    public static long product(int[][] mat) {
        long prod = 1L;
        for (int[] row : mat) {
            for (int x : row) prod *= x;
        }
        return prod;
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        System.out.println(product(m)); // 24
    }
}
