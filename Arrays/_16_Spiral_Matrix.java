package Arrays;

public class _16_Spiral_Matrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Print Top Part
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            // Print Right Part
            for (int i = startRow; i < endRow; i++) {
                System.out.print(matrix[i + 1][endColumn] + " ");
            }
            // Print Bottom Part
            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            // Print Left Part
            for (int i = endRow - 1; i > startRow; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
        System.out.println("\n\n");
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println("\n\n");
        printSpiral(matrix);
    }
}
