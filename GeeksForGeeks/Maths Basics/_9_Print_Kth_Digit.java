/*

Print the Kth Digit
Difficulty: BasicAccuracy: 38.65%Submissions: 46K+Points: 1
Given two numbers a and b, find kth digit from right of ab.

Example 1:

Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
Input: a = 5, b = 2, k = 2
Output: 2
Explanation: 52 = 25 and second digit from right is 2.

*/

public class _9_Print_Kth_Digit {
    public static long kthDigit(int a, int b, int k) {
        // code here
        long power = (long) Math.pow(a, b);

        int iteration = 1;
        while (power > 0) {
            long reminder = power % 10;
            if (iteration++ == k) {
                return reminder;
            }
            power = power / 10;
        }

        return -1;
    }

    public static void main(String args[]) {
        System.out.println(kthDigit(3, 3, 1));
        System.out.println(kthDigit(5, 2, 2));
    }
}
