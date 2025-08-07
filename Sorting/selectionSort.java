package Sorting;

import java.util.Random;

public class selectionSort {
    public static void selectionSortAlgorithm(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumElementPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimumElementPosition] > array[j]) {
                    minimumElementPosition = j;
                }
            }
            int temp = array[minimumElementPosition];
            array[minimumElementPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void displayArray(int array[]) {
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10); // generates a random integer (could be negative)
        }

        return array;
    }

    public static void main(String args[]) {
        int array[] = generateRandomArray(5);
        // int array[] = { 8, 5, 4, 3, 10, 2, 1, 7, 6 };

        displayArray(array);
        selectionSortAlgorithm(array);
        displayArray(array);
    }
}
