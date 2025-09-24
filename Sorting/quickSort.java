package Sorting;

public class quickSort {

    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static void quickSortAlgorithm(int array[], int startingIndex, int endingIndex) {
        if (startingIndex >= endingIndex) {
            return;
        }

        int pivoitIndex = partitioning(array, startingIndex, endingIndex);
        quickSortAlgorithm(array, startingIndex, pivoitIndex - 1);
        quickSortAlgorithm(array, pivoitIndex + 1, endingIndex);
    }

    public static int partitioning(int array[], int startingIndex, int endingIndex) {
        int pivoit = array[endingIndex];
        int i = startingIndex - 1;

        for (int j = startingIndex; j <= endingIndex; j++) {
            if (array[j] < pivoit) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        array[endingIndex] = array[i];
        array[i] = pivoit;
        return i;
    }

    public static void main(String args[]) {
        int array[] = { 6, 3, 9, 8, 2, 5 };
        System.out.print("\n\nOriginal Array = ");
        displayArray(array);
        quickSortAlgorithm(array, 0, array.length - 1);
        System.out.print("\nAfter Sorting = ");
        displayArray(array);
        System.out.println("\n\n");
    }
}