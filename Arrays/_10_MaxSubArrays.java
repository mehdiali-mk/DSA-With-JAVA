package Arrays;

import java.util.*;

public class _10_MaxSubArrays {
    public static void subArrays(int array[]) {
        int maximumSum = Integer.MIN_VALUE;
        int subArray[] = { 0, 0 };
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j > i; j--) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += array[k];
                }
                if (maximumSum < sum) {
                    maximumSum = sum;
                    subArray[0] = i;
                    subArray[1] = j;
                }
            }
        }

        System.out.print("\n\n(");
        for (int i = subArray[0]; i < subArray[1]; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println(") = " + maximumSum + "\n\n");
    }

    public static void main(String args[]) {
        int array[] = { 1, -2, 6, -1, 3 };

        subArrays(array);
    }
}
