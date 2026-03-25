class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totalSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                totalSum += grid[i][j];
            }
        }
        if (totalSum % 2 != 0) return false;

        long half = totalSum / 2;
        long rowSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rowSum += grid[i][j];
            }
            if (rowSum == half) return true;
        }
        long colSum = 0;
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                colSum += grid[i][j];
            }
            if (colSum == half) return true;
        }
        return false;
    }
}