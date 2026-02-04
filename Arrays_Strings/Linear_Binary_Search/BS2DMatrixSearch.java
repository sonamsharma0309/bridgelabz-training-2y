public class BS2DMatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / cols;
            int c = mid % cols;
            int val = matrix[r][c];

            if (val == target) return true;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 3, 5},
                {7, 9, 11}
        };
        System.out.println(searchMatrix(m, 9));  // true
        System.out.println(searchMatrix(m, 10)); // false
    }
}
