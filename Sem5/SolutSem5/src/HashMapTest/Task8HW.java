// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга

package HashMapTest;

public class Task8HW {
    private static final int BOARD_SIZE = 8;
    private static final char QUEEN = 'Q';
    private static final char EMPTY = '-';

    private char[][] board;

    public Task8HW() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private boolean isSafe(int row, int col) {
        // Проверяем горизонталь и вертикаль
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == QUEEN || board[i][col] == QUEEN) {
                return false;
            }
        }

        // Проверяем диагонали
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if ((i + j == row + col || i - j == row - col) && board[i][j] == QUEEN) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean solveQueens(int col) {
        if (col >= BOARD_SIZE) {
            return true; // Все ферзи успешно расставлены
        }

        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) {
                board[row][col] = QUEEN;

                if (solveQueens(col + 1)) {
                    return true;
                }

                board[row][col] = EMPTY; // Откат изменений, если не найдено решение
            }
        }

        return false; // Нет решения для текущего столбца
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Solution3() {
        Task8HW eightQueens = new Task8HW();
        if (eightQueens.solveQueens(0)) {
            eightQueens.printBoard();
        } else {
            System.out.println("Нет решения.");
        }
    }
}
