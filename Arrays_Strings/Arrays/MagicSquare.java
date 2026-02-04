public class MagicSquare {
    // Checks if the given square matrix is a magic square (all row sums, col sums, and diagonals equal).
    public static boolean isMagicSquare(int[][] mat) {
        int n = mat.length;
        if (n == 0) return false;
        for (int[] row : mat) {
            if (row == null || row.length != n) return false; // must be n x n
        }

        int target = 0;
        for (int j = 0; j < n; j++) target += mat[0][j];

        // rows
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) sum += mat[i][j];
            if (sum != target) return false;
        }

        // cols
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) sum += mat[i][j];
            if (sum != target) return false;
        }

        // diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += mat[i][i];
            d2 += mat[i][n - 1 - i];
        }
        return d1 == target && d2 == target;
    }

    public static void main(String[] args) {
        int[][] magic = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        System.out.println(isMagicSquare(magic)); // true
    }
}
