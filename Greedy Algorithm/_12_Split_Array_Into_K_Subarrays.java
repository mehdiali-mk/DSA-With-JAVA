/*

Question 5 :
Split the given array into K sub-arrays
We have an Array[] of N elements and a number K. ( 1 <= K<= N) . Split the given array into K sub arrays (they must cover all the elements). The maximum sub array sum achievable out of K sub arrays formed must be the minimum possible. Find that possible sub array sum.
Sample Input 1: Array[] = {1, 1, 2} K = 2
Sample Output 1: 2
Sample Input 2: Array [] = {1,2,3,4}, K = 3
Sample Output 2: 4

*/

public class _12_Split_Array_Into_K_Subarrays {

    public static int answer = 10000000;

    public static void solve(int array[], int number, int k, int index, int sum, int maxSum) {
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            for (int i = index; i < number; i++) {
                sum += array[i];
            }

            maxSum = Math.max(maxSum, sum);
            answer = Math.min(answer, maxSum);

            return;
        }

        sum = 0;

        for (int i = index; i < number; i++) {
            sum += array[i];
            maxSum = Math.max(maxSum, sum);
            solve(array, number, k - 1, i + 1, 0, maxSum);
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4 };
        int K = 3;
        int number = array.length;
        solve(array, number, K, 0, 0, 0);

        System.out.println("\n\n\nMinimum Sub-Array = " + answer + "\n\n\n");

    }
}
