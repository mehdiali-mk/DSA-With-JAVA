package Arrays;

import java.util.*;

public class _15_2D_Array_Matrix {
    public static void findElementInMatrix(int martix[][], int elementTofind) {
        boolean found = false;
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[0].length; j++) {
                if (martix[i][j] == elementTofind) {
                    System.out.println("\nElement " + elementTofind + " is found at ( " + i + " , " + j + " ).");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("\nElement " + elementTofind + " is not found in matrix.");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.err.print("\nEnter the number of rows for matrix = ");
        int numberOfRows = sc.nextInt();

        System.err.print("Enter the number of columns for matrix = ");
        int numberOfColumns = sc.nextInt();
        int matrix[][] = new int[numberOfRows][numberOfColumns];
        System.out.println("\nEnter the elements of a matrix:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nRepresent the matrix:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.print("\n\nEnter the element to find in matrix:");
        int elementTofind = sc.nextInt();

        findElementInMatrix(matrix, elementTofind);

    }
}
