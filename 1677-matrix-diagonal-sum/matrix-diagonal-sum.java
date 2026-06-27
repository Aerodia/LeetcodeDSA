class Solution {
    public int diagonalSum(int[][] mat) {
        int primary = 0;
        int secondary = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            primary += mat[i][i];
            secondary += mat[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            primary -= mat[n / 2][n / 2];
        }
        return primary + secondary;
    }
}