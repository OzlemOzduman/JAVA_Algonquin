package Project2;

import java.util.Scanner;

public class Connect4Project {


    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '_';
    private static final char PLAYER_ONE = 'R';
    private static final char PLAYER_TWO = 'Y';
    private static char[][] board = new char[ROWS][COLS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();
        boolean gameOver = false;
        char currentPlayer = PLAYER_ONE;

        printBoard();

        while (!gameOver) {
            System.out.println("Player " + currentPlayer + ", choose a column (0-6): ");
            int col = scanner.nextInt(); // user just enter column number

            if (col < 0 || col >= COLS || board[0][col] != EMPTY) { // control for column is availabe 
                System.out.println("Invalid move. Try again.");
                continue;
            }

            int row = dropPiece(col, currentPlayer);
            printBoard();

            if (checkWin(row, col, currentPlayer)) {
                System.out.println("Player " + currentPlayer + "is winer!");
                gameOver = true;
            } else if (isBoardFull()) {
                System.out.println("It's a tie!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == PLAYER_ONE) ? PLAYER_TWO : PLAYER_ONE;
            }
        }

        scanner.close();
    }

    private static void initBoard() { // create an empty board game
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++)
                board[r][c] = EMPTY;
    }

    private static void printBoard() {
        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }

    private static int dropPiece(int col, char symbol) {
        // the method is returned row number which user enter the col 
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == EMPTY) {
                board[row][col] = symbol;
                return row;
            }
        }
        return -1; // This should not happen if input is valid
    }

    private static boolean checkWin(int row, int col, char symbol) {
        return checkDirection(row, col, symbol, 1, 0)   // vertical
            || checkDirection(row, col, symbol, 0, 1)   // horizontal
            || checkDirection(row, col, symbol, 1, 1)   // diagonal /
            || checkDirection(row, col, symbol, 1, -1); // diagonal \
    }

    private static boolean checkDirection(int row, int col, char symbol, int rowDelta, int colDelta) {
        //  contol each direction symbol number is 4 
        int count = 1; 
        // check in one direction
        count += countPieces(row, col, symbol, rowDelta, colDelta);
        // check in opposite direction
        count += countPieces(row, col, symbol, -rowDelta, -colDelta);

        return count >= 4;
    }

    private static int countPieces(int row, int col, char symbol, int rowDelta, int colDelta) {
        //count the user symbol
        int count = 0;   
        int r = row + rowDelta;
        int c = col + colDelta;

        while (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == symbol) {
            count++;
            r += rowDelta;
            c += colDelta;
        }
        return count;
    }

    private static boolean isBoardFull() {
        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == EMPTY)
                return false;
        }
        return true;
    }


}
