package Recursion;

public class _6_Is_Array_Sorted {
    static Boolean isArraySorted(int array[], int startIndex) {
        if (startIndex == array.length - 1) {
            return true;
        }
        return array[startIndex] < array[startIndex + 1] || isArraySorted(array, startIndex + 1);
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.print("\n\nCurrent Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nIs Array Sorted: " + isArraySorted(array, 0) + "\n\n");
    }
}
