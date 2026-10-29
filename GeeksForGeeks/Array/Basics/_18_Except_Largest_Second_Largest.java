import java.util.Arrays;

public class _18_Except_Largest_Second_Largest {
    public static long[] findElements(long arr[]) {
        // code here

        // if (arr == null || arr.length <= 2) {
        // return new long[0];
        // }

        // int largestIndex = arr[0] > arr[1] ? 0 : 1;
        // int secondLargestIndex = arr[0] > arr[1] ? 1 : 0;

        // for (int i = 2; i < arr.length; i++) {
        // if (arr[i] >= arr[largestIndex]) {
        // secondLargestIndex = largestIndex;
        // largestIndex = i;
        // } else if (arr[i] > arr[secondLargestIndex]) {
        // secondLargestIndex = i;
        // }
        // }

        // long[] result = new long[arr.length - 2];
        // int indexCount = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (i == largestIndex || i == secondLargestIndex) {
        // continue;
        // }
        // result[indexCount++] = arr[i];
        // }

        Arrays.sort(arr);

        return Arrays.copyOfRange(arr, 0, arr.length - 2);
    }

    public static void displayArray(long array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        long myArray[] = new long[] { 2, 8, 7, 1, 5 };

        long result[] = findElements(myArray);
        displayArray(myArray);
        System.out.println();
        displayArray(result);

    }
}