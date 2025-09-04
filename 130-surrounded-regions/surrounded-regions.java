public class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Step 1️⃣: Mark all 'O's connected to the border as 'P'
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }

        // Step 2️⃣: Flip all unmarked 'O's to 'X'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

        // Step 3️⃣: Convert marked 'P's back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'P') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // Helper DFS method to mark connected 'O's
    private void dfs(char[][] board, int i, int j) {
        // Base case: check bounds and only mark 'O's
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        // Mark current 'O' as 'P' (Protected)
        board[i][j] = 'P';

        // Visit all 4 directions
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}