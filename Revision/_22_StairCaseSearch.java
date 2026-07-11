import java.util.Scanner;

public class _22_StairCaseSearch {
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

        System.out.println("\n\nEnter the element to search = ");
        int elementToFind = sc.nextInt();

        int elementPosition[] = findElementPosition2DArray(myArray, elementToFind);

        if (elementPosition[0] != -1) {
            System.out.println("\nElement Found:");
            // fixed
            System.out.println("myArray[" + elementPosition[0] + "," + elementPosition[1] + "] = " + elementToFind);
        } else {
            System.out.println("\nElement Not Found:");
        }

    }

    public static int[] findElementPosition2DArray(int myArray[][], int elementToFind) {
        int rowPosition, columnPosition;

        int currentRow = 0;
        int currentColumn = myArray[0].length - 1;

        while (currentRow < myArray.length && currentColumn >= 0) {
            if (elementToFind == myArray[currentRow][currentColumn]) {
                return new int[] { currentRow, currentColumn };
            } else if (elementToFind < myArray[currentRow][currentColumn]) {
                currentColumn--;
            } else {
                currentRow++;
            }
        }

        return new int[] { -1, -1 };
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