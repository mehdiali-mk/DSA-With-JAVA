import java.util.Scanner;

public class _21_Diagonal_SUM {
    public static void main(String args[]) {
        int rowSize, colSize;

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the row size = ");
        rowSize = sc.nextInt();
        System.out.print("Enter the column size = ");
        colSize = sc.nextInt();

        int myArray[][] = new int[rowSize][colSize];

        System.out.println("\nEnter the array elements = ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print("Enter array[" + i + "][" + j + "] = ");
                myArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n2D Array:");
        print2dArray(myArray);

        int diagonalSum = findDiagonalSum(myArray);
        System.out.println("\n\nDiagonal Sum: " + diagonalSum);
    }

    public static int findDiagonalSum(int myArray[][]) {
        int diagonalSum = 0;
        for (int i = 0; i < myArray.length; i++) {
            diagonalSum += myArray[i][i];
            if (i != myArray.length - 1 - i)
                diagonalSum += myArray[i][myArray.length - 1 - i];
        }
        return diagonalSum;
    }

    public static void print2dArray(int myArray[][]) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}