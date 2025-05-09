public class nqueen {

    public static void main(String[] args) {
        int n = 4; // You can change this to any value of N
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solveNQueens(board, 0);
    }

    static void solveNQueens(char[][] board, int row) {
        int n = board.length;

        if (row == n) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solveNQueens(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static void printBoard(char[][] board) {
        System.out.println("Solution:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
