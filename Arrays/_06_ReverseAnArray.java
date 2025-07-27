package Arrays;

public class _06_ReverseAnArray {
    public static void reverseArray(int array[]) {
        int start = 0, end = array.length - 1;

        while (start < end) {
            // Swap.
            array[start] = array[start] + array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10, 12 };

        reverseArray(array);
        System.out.print("\n\nReverse Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.print("]\n\n");
    }
}
