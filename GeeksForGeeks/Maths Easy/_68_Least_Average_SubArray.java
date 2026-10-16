public class _68_Least_Average_SubArray {

    public static int leastAvg(int[] arr, int k) {
        // code here
        int leastSum = 0;
        int currentSum = 0;
        int leastAverageIndex = 1;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        leastSum = currentSum;

        for (int i = k; i < arr.length; i++) {

            currentSum = currentSum + arr[i] - arr[i - k];

            if (currentSum < leastSum) {
                leastSum = currentSum;

                leastAverageIndex = (i - k + 1) + 1;
            }
        }

        return leastAverageIndex;
    }

    public static void main(String args[]) {
        int myArray[] = { 30, 20, 10 };

        System.out.println(leastAvg(myArray, 1));
        ;
    }
}
