package Arrays;

public class _19_Search_In_Sorted_Matrix {
    public static void staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.print("\n\n" + key + " found at location (" + row + ", " + column + ").\n\n");
                return;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }

        System.out.println("\n\n" + key + " does not exists.");
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;

        staircaseSearch(matrix, key);
    }
}
