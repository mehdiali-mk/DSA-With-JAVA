package Sorting;

public class countingSort {
    public static void countingSortAlgorithm(int array[]) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        int frequency[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            frequency[array[i]] += 1;
        }

        int j = 0;
        for (int i = 1; i < maxNumber; i++) {
            while (frequency[i] != 0) {
                array[j] = i;
                j++;
                frequency[i] -= 1;
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

    public static void main(String args[]) {
        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        displayArray(array);
        countingSortAlgorithm(array);
        displayArray(array);
        System.out.println("\n\n");

    }
}