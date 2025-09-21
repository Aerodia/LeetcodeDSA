class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solveNQueensHelper(n, result, board, 0);
        return result;
    }
    private boolean isSafePlace(int n, char[][] board, int row, int col) {
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    private void solveNQueensHelper(int n, List<List<String>> result, char[][] board, int row) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : board) {
                solution.add(new String(rowArray));
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafePlace(n, board, row, col)) {
                board[row][col] = 'Q';
                solveNQueensHelper(n, result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }
}