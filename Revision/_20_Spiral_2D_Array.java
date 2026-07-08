import java.util.Scanner;

public class _20_Spiral_2D_Array {
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

        System.out.println("\n\nSpiral Matrix:");
        printSpiralMatrix(myArray);
    }

    public static void printSpiralMatrix(int myArray[][]) {
        // int startingRow = startingColumn = 0, endingColumn = endingRow =
        // myArray.length - 1;

        // for (int i = startingColumn; i < endingColumn; i++) {
        // System.out.print(myArray[startingRow][i] + " ");
        // }
        // for (int i = startingRow; i < endingRow; i++) {
        // System.out.print(myArray[i][endingColumn]);
        // }
        // for (int i = endingColumn; i >= startingColumn; i--) {
        // System.out.println(myArray[endingRow][i]);
        // }
        // for (int i = endingRow; i >= startingRow; i--) {
        // System.out.println(myArray[i][startingColumn]);
        // }

        int starting = 0, ending = myArray.length - 1;

        while (starting <= ending) {
            for (int i = starting; i <= ending; i++) {
                System.out.print(myArray[starting][i] + " ");
            }
            for (int i = starting + 1; i <= ending; i++) {
                System.out.print(myArray[i][ending] + " ");
            }
            for (int i = ending - 1; i >= starting; i--) {
                System.out.print(myArray[ending][i] + " ");
            }
            for (int i = ending - 1; i > starting; i--) {
                System.out.print(myArray[i][starting] + " ");
            }
            starting++;
            ending--;
        }
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