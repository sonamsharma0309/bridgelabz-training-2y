public class SumOf2DArray {
    public static long sum(int[][] mat) {
        long s = 0;
        for (int[] row : mat) {
            for (int x : row) s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        System.out.println(sum(m)); // 10
    }
}
