import java.util.ArrayList;

public class _23_Max_Pair {

    public static int maxProduct(int[] arr) {
        // code here
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 4, 3, 6, 7, 0 };

        System.out.println(maxProduct(myArray));
    }
}
