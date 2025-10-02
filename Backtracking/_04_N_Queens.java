package Backtracking;

public class _04_N_Queens {

    public static boolean isSafe(char chessBoard[][], int numberOfRows, int numberOfColumns) {

        for (int i = numberOfRows - 1; i >= 0; i--) {
            if (chessBoard[i][numberOfColumns] == 'Q') {
                return false;
            }
        }

        for (int i = numberOfRows - 1, j = numberOfColumns - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = numberOfRows - 1, j = numberOfColumns + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char chessBoard[][], int numberOfRows) {
        if (numberOfRows == chessBoard.length) {
            printNQueens(chessBoard);
            return;
        }
        for (int i = 0; i < chessBoard.length; i++) {
            if (isSafe(chessBoard, numberOfRows, i)) {
                chessBoard[numberOfRows][i] = 'Q';
                nQueens(chessBoard, numberOfRows + 1);
                chessBoard[numberOfRows][i] = '_';
            }
        }
    }

    public static void printNQueens(char chessBoard[][]) {
        System.out.println("\n-------- N Queens --------");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int rowsAndColumns = 4;
        char chessBoard[][] = new char[rowsAndColumns][rowsAndColumns];
        for (int i = 0; i < rowsAndColumns; i++) {
            for (int j = 0; j < rowsAndColumns; j++) {
                chessBoard[i][j] = '_';
            }
        }
        System.out.println("\n\nN Queen Chess Problem.");
        nQueens(chessBoard, 0);
        System.out.println("\n\n");
    }
}