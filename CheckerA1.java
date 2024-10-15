import java.util.Scanner;

public class Checker {

    public static void main(String[] args) {

        int[][] CheckerBoard = createCustomBoard();
        boolean isGameOn = true;
        printCustomBoard(CheckerBoard);

        while (isGameOn) {
            playTurn(1, CheckerBoard);
            printCustomBoard(CheckerBoard);
            playTurn(2, CheckerBoard);
            printCustomBoard(CheckerBoard);
        }
    }

    public static int[][] createCustomBoard() {

        int[][] board = {
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
                {2, 0, 2, 0, 2, 0, 2, 0}
        };
        return board;
    }

    public static void playTurn(int currentPlayer, int[][] board) {

        System.out.println("Turn of player no. " + currentPlayer);
        System.out.println("Coordinates of piece to move");

        Scanner scanner = new Scanner(System.in);
        System.out.print("  Enter X: ");
        int xInputA = scanner.nextInt();
        if (xInputA == -1) {
            System.exit(0);
        }

        System.out.print("  Enter Y: ");
        int yInputA = scanner.nextInt();
        if (yInputA == -1) {
            System.exit(0);
        }

        System.out.println("Coordinates of new position");
        System.out.print("  Enter X: ");
        int xInputB = scanner.nextInt();
        if (xInputB == -1) {
            System.exit(0);
        }

        System.out.print("  Enter Y: ");
        int yInputB = scanner.nextInt();
        if (yInputB == -1) {
            System.exit(0);
        }

        board[yInputA][xInputA] = 0;
        board[yInputB][xInputB] = currentPlayer;
    }

    public static void printCustomBoard(int [][] board) {
        System.out.println("   0 1 2 3 4 5 6 7   <- X axis \n  +----------------+");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 0){
                    System.out.print("  ");
                } else {
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.print("| \n");
        }
        System.out.println("  +----------------+\n   0 1 2 3 4 5 6 7 \n");
    }
}

