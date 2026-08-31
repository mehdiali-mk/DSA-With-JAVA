
/*
Smallest Divisible by 1 to n
Difficulty: BasicAccuracy: 49.12%Submissions: 35K+Points: 1Average Time: 15m
Given a number n, find an integer denoting the smallest number evenly divisible by each number from 1 to n.

Examples:

Input: n = 3
Output: 6
Explanation: 6 is the smallest number divisible by 1, 2 and 3.
Input: n = 6
Output: 60
Explanation: 60 is the smallest number divisible by all from 1 to 6.

*/
public class _12_Smallest_Divisible_By_1_And_N {
    public static long getSmallestDivNum(int n) {
        long ans = 1;

        for (long i = 2; i <= n; i++) {
            ans = (ans / gcd(ans, i)) * i;
        }

        return ans;
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        System.out.println(getSmallestDivNum(6));
    }
}
