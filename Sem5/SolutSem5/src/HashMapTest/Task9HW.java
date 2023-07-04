// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз

package HashMapTest;

public class Task9HW {
    private static final int[] ROW_MOVES = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] COL_MOVES = {-1, 1, -2, 2, -2, 2, -1, 1};

    private int[][] board;
    private int boardSize;

    public Task9HW(int boardSize) {
        this.boardSize = boardSize;
        board = new int[boardSize][boardSize];
    }

    public void solveTour() {
        initializeBoard();
        board[0][0] = 1; // Начальная позиция коня

        if (solve(0, 0, 2)) {
            printBoard();
        } else {
            System.out.println("Нет решения.");
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = 0;
            }
        }
    }

    private boolean solve(int row, int col, int moveCount) {
        if (moveCount > boardSize * boardSize) {
            return true; // Все клетки посещены
        }

        for (int i = 0; i < 8; i++) {
            int newRow = row + ROW_MOVES[i];
            int newCol = col + COL_MOVES[i];

            if (isValidMove(newRow, newCol)) {
                board[newRow][newCol] = moveCount;

                if (solve(newRow, newCol, moveCount + 1)) {
                    return true;
                }

                board[newRow][newCol] = 0; // Откат изменений, если не найдено решение
            }
        }

        return false; // Нет решения для текущей позиции
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize && board[row][col] == 0;
    }

    private void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Solution4() {
        int boardSize = 8; // Размер доски NxN
        Task9HW knightTour = new Task9HW(boardSize);
        knightTour.solveTour();
    }
}
