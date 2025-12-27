/*
Min Absolute Difference Pairs

Given two arrays A and B of equal length n. Pair each element of array A to an element
in array B, such that sum S of absolute differences of all the pairs is minimum.

A = [1, 2, 3]
B = [2, 1, 3]
ans = 0

*/

import java.util.Arrays;

public class _03_Minimum_Absolute_Difference {
    public static void main(String args[]) {
        int array1[] = { 4, 1, 8, 7 };
        int array2[] = { 6, 3, 2, 5 };

        Arrays.sort(array1);
        Arrays.sort(array2);

        int minimumAbsoluteDifference = 0;

        for (int i = 0; i < array1.length; i++) {
            minimumAbsoluteDifference += Math.abs(array1[i] - array2[i]);
        }

        System.out.println("\n\n\nMinimum Abs Difference = " + minimumAbsoluteDifference + "\n\n\n");
    }
}
