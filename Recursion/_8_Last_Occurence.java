package Recursion;

public class _8_Last_Occurence {
    static int lastOccurence(int array[], int endIndex, int key) {
        if (endIndex < 0) {
            return -1;
        } else if (array[endIndex] == key) {
            return endIndex;
        }
        return lastOccurence(array, endIndex - 1, key);
    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 8, 5, 4, 6, 8, 5, 3, 6 };
        System.out.print("\n\nCurrent Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nElement 8 found at index " + lastOccurence(array, array.length - 1, 8));
        System.out.println("Element 4 found at index " + lastOccurence(array, array.length - 1, 4));
        System.out.println("Element 10 found at index " + lastOccurence(array, array.length - 1, 10) + "\n\n");
    }
}
