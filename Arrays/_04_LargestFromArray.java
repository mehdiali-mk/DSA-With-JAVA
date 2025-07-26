package Arrays;

import java.util.*;

public class _04_LargestFromArray {
    public static int largestFromArray(int array[]) {
        int largestElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largestElement < array[i]) {
                largestElement = array[i];
            }
        }

        return largestElement;
    }

    public static void main(String args[]) {
        int array[] = { 99, 101, 86, 53, 103, 155 };
        int largestElement = largestFromArray(array);

        System.out.println("\nLargest Element = " + largestElement + "\n\n");
    }
}
