package Sorting;

public class mergeSort {

    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static void mergeSortAlgorithm(int array[], int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        mergeSortAlgorithm(array, startIndex, midIndex);
        mergeSortAlgorithm(array, midIndex + 1, endIndex);
        merge(array, startIndex, midIndex, endIndex);

    }

    public static void merge(int array[], int startIndex, int midIndex, int endIndex) {
        int tempArray[] = new int[endIndex - startIndex + 1];

        int leftIterator = startIndex;
        int rightIterator = midIndex + 1;
        int tempIterator = 0;

        while (leftIterator <= midIndex && rightIterator <= endIndex) {
            if (array[leftIterator] < array[rightIterator]) {
                tempArray[tempIterator] = array[leftIterator];
                leftIterator++;
            } else {
                tempArray[tempIterator] = array[rightIterator];
                rightIterator++;
            }
            tempIterator++;
        }

        while (leftIterator <= midIndex) {
            tempArray[tempIterator++] = array[leftIterator++];
        }

        while (rightIterator <= endIndex) {
            tempArray[tempIterator++] = array[rightIterator++];
        }

        for (tempIterator = 0, leftIterator = startIndex; tempIterator < tempArray.length; tempIterator++, leftIterator++) {
            array[leftIterator] = tempArray[tempIterator];
        }
    }

    public static void main(String args[]) {
        int array[] = { 6, 3, 9, 5, 2, 8 };
        System.out.print("\n\nOriginal Array = ");
        displayArray(array);
        mergeSortAlgorithm(array, 0, array.length - 1);
        System.out.print("\nAfter Sorting = ");
        displayArray(array);
        System.out.println("\n\n");
    }
}
