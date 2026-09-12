/*

Check for Perfect Power Number
Difficulty: BasicAccuracy: 39.37%Submissions: 13K+Points: 1
Given a positive integer n, determine whether it can be expressed in the form x^y, where x and y are integers, x > 0, and y > 1.

Return true if such integers x and y exist; otherwise, return false.

Examples:

Input: n = 8
Output: true
Explanation: 8 can be expressed as 23.
Input: n = 7
Output: false 
Explanation: There do not exist integers x > 0 and y > 1 such that 7 = xy.
Constraints:
1 ≤ n ≤ 104

*/

public class _28_Perfect_Power_Number {

    public static boolean checkPower(int n) {
        // code here
        if (n == 1) {
            return true;
        }

        for (int x = 2; x <= (int) Math.sqrt(n); x++) {
            int currentValue = x * x;

            while (currentValue <= n) {
                if (currentValue == n) {
                    return true;
                }
                currentValue *= x;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        System.out.println(checkPower(8));
    }
}