package Arrays;

public class _12_KadaneAlgo {
    public static void kadaneMaxSum(int array[]) {
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("\nMaximum Sum of Sub Array = " + maximumSum + "\n\n");
    }

    public static void main(String args[]) {
        int array[] = { -1, -3, 4, -1, -2, 1, 5, -3 };
        kadaneMaxSum(array);
    }
}
