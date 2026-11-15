public class _51_Max_Sum_Two_Adjecent {
    public static int maxAdjSum(int[] arr) {
        // code here
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int currentSum = arr[i] + arr[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(maxAdjSum(myArray));
    }
}
