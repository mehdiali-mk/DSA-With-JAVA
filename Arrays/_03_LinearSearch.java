package Arrays;

public class _03_LinearSearch {
    public static int linearSearch(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        int value = 5;

        int valueAtIndex = linearSearch(array, value);

        if (valueAtIndex == -1) {
            System.out.println("\nValue " + value + " not found in an array.");
        } else {
            System.out.println("\nValue " + value + " found at Index " + valueAtIndex + " in an array.");

        }
    }
}
