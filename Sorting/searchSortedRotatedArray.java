package Sorting;

public class searchSortedRotatedArray {

    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static int searchElement(int array[], int elementToFind, int startingIndex, int endingIndex) {
        if (startingIndex > endingIndex) {
            return -1;
        }

        int middleIndex = startingIndex + (endingIndex - startingIndex) / 2;

        if (array[middleIndex] == elementToFind) {
            return middleIndex;
        }

        if (array[startingIndex] <= array[middleIndex]) {
            if (array[startingIndex] <= elementToFind && elementToFind <= array[middleIndex]) {
                return searchElement(array, elementToFind, startingIndex, middleIndex - 1);
            } else {
                return searchElement(array, elementToFind, middleIndex + 1, endingIndex);
            }
        } else {
            if (array[middleIndex] <= elementToFind && elementToFind <= array[endingIndex]) {
                return searchElement(array, elementToFind, middleIndex + 1, endingIndex);
            } else {
                return searchElement(array, elementToFind, startingIndex, middleIndex - 1);
            }
        }

    }

    public static void main(String args[]) {
        int array[] = { 4, 5, 6, 7, 0, 1, 2 };
        int elementToFind = 0;
        System.out.println("\n\nArray Elements = ");
        displayArray(array);
        System.out.println("\nElement " + elementToFind + " is found on index "
                + searchElement(array, elementToFind, 0, array.length - 1));
        elementToFind = 2;
        System.out.println("Element " + elementToFind + " is found on index "
                + searchElement(array, elementToFind, 0, array.length - 1));
        elementToFind = 4;
        System.out.println("Element " + elementToFind + " is found on index "
                + searchElement(array, elementToFind, 0, array.length - 1) + "\n\n");
    }
}
