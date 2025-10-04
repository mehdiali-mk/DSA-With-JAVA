package Backtracking;

public class _06_Sudoku_Solver {

    public static boolean isSafe(int sudoku[][], int rowNumber, int columnNumber, int digit) {

        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][columnNumber] == digit) {
                return false;
            }
        }

        for (int j = 0; j <= 8; j++) {
            if (sudoku[rowNumber][j] == digit) {
                return false;
            }
        }

        int matrixRow = (rowNumber / 3) * 3;
        int matrixColumn = (columnNumber / 3) * 3;

        for (int i = matrixRow; i < matrixRow + 3; i++) {
            for (int j = matrixColumn; j < matrixColumn + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solveSudoku(int sudoku[][], int rowNumber, int columnNumber) {
        if (rowNumber == 9) {
            return true;
        }

        int nextRowNumber = rowNumber;
        int nextColumnNumber = columnNumber + 1;
        if (columnNumber + 1 == 9) {
            nextRowNumber = rowNumber + 1;
            nextColumnNumber = 0;
        }

        if (sudoku[rowNumber][columnNumber] != 0) {
            return solveSudoku(sudoku, nextRowNumber, nextColumnNumber);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, rowNumber, columnNumber, digit)) {
                sudoku[rowNumber][columnNumber] = digit;
                if (solveSudoku(sudoku, nextRowNumber, nextColumnNumber)) {
                    return true;
                }
                sudoku[rowNumber][columnNumber] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("\n\nSolved Sudoku:\n");
            printSudoku(sudoku);
            System.out.println("\n\n");
        } else {
            System.out.println("\n\nSolution does not exists.\n\n");
        }

    }
}