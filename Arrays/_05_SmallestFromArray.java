package Arrays;

import java.util.*;

public class _05_SmallestFromArray {
    public static int smallestFromArray(int array[]) {
        int smallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (smallestElement > array[i]) {
                smallestElement = array[i];
            }
        }

        return smallestElement;
    }

    public static void main(String args[]) {
        int array[] = { 99, 101, 86, 53, 103, 155 };
        int smallestElement = smallestFromArray(array);

        System.out.println("\nSmallest Element = " + smallestElement + "\n\n");
    }
}
