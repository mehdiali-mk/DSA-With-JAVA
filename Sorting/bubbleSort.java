package Sorting;

import java.util.Random;

public class bubbleSort {
    public static void bubbleSortAlgorithm(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
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
        bubbleSortAlgorithm(array);
        displayArray(array);
        System.out.println("\n");
    }
}