package Recursion;

public class _7_First_Occurence {
    static int firstOccurence(int array[], int startIndex, int key) {
        if (startIndex == array.length) {
            return -1;
        } else if (array[startIndex] == key) {
            return startIndex;
        }
        return firstOccurence(array, startIndex + 1, key);
    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 8, 5, 4 };
        System.out.print("\n\nCurrent Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nElement 8 found at index " + firstOccurence(array, 0, 8));
        System.out.println("Element 4 found at index " + firstOccurence(array, 0, 4));
        System.out.println("Element 10 found at index " + firstOccurence(array, 0, 10) + "\n\n");
    }
}
