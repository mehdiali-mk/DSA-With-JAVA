package Backtracking;

public class _01_Backtracking_In_Array {
    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static void changeArray(int array[], int currentIndex, int value) {
        if (currentIndex == array.length) {
            System.out.println("\n\nArray Before Backtracking = ");
            displayArray(array);
            return;
        }

        array[currentIndex] = value;
        changeArray(array, currentIndex + 1, value + 1);
        array[currentIndex] -= 2;
    }

    public static void main(String args[]) {
        int array[] = new int[5];

        changeArray(array, 0, 1);
        System.out.println("\nArray After Backtracking = ");
        displayArray(array);
        System.out.println("\n\n");
    }
}
