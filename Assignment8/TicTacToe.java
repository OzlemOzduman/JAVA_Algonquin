import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static String player1Name;
    static String player2Name;
    static char activePlayerChar;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first player name: ");
         player1Name = scanner.nextLine();
       
        System.out.println("Enter your second player name: ");
         player2Name = scanner.nextLine();
         boolean isGameRunning = true;
         activePlayerChar = gameChar(player1Name);
        initBoard();

        while (isGameRunning) {
            displayBoard(); // each time board is displayed
            getPlayerMove(scanner); // we get row and col numbers from user
            if (checkWin()) {
                displayBoard();
                System.out.println(" Player " + activePlayerChar + " win!");
                isGameRunning = false;
            } else if (checkDraw()) {
                displayBoard();
                System.out.println(" Game is tie");
                isGameRunning = false;
            } else {
                switchPlayer();
            }
        }

        scanner.close();
        System.out.println("Game Over :)");
    }

    
    public static char gameChar(String name){
        return Character.toUpperCase(name.charAt(0)); // get initial letter from user name
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
    public static void getPlayerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.print(" Hey " + activePlayerChar + ", Enter row and col number (0 2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (isValidMove(row, col)) {
                board[row][col] = activePlayerChar; // when we get the row and col number loop is stopped
                break;
            } else {
                System.out.println("Wrong step, Please enter number depends on board size");
            }
        }
    }
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    public static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // row contol
            if (board[i][0] == activePlayerChar &&
                board[i][1] == activePlayerChar &&
                board[i][2] == activePlayerChar)
                return true;

            // col control
            if (board[0][i] == activePlayerChar &&
                board[1][i] == activePlayerChar &&
                board[2][i] == activePlayerChar)
                return true;
        }

        // diagnal control
        if (board[0][0] == activePlayerChar &&
            board[1][1] == activePlayerChar &&
            board[2][2] == activePlayerChar)
            return true;

        if (board[0][2] == activePlayerChar &&
            board[1][1] == activePlayerChar &&
            board[2][0] == activePlayerChar)
            return true;

        return false;
    }
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }   
 
    public static void switchPlayer() {
        activePlayerChar = (activePlayerChar == gameChar(player1Name)) ? gameChar(player2Name) : gameChar(player1Name);
    }

}
