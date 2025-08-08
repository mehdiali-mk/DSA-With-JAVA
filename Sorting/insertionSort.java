package Sorting;

import java.util.Random;

public class insertionSort {

    public static void insertionSortAlogrithm(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && array[previousIndex] > currentElement) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentElement;
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

        displayArray(array);
        insertionSortAlogrithm(array);
        displayArray(array);
        System.out.println("\n\n");
    }
}
