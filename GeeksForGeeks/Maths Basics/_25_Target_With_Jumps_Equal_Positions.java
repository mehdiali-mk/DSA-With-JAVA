/*

Target with Jumps Equal to Positions
Solved
Difficulty: BasicAccuracy: 51.83%Submissions: 15K+Points: 1Average Time: 5m
Given an integer n, and a frog starts at position 0.

In the first jump, it moves 1 unit forward.
After that, if the frog is currently at position x, its next jump length is exactly x units.
Determine whether the frog can reach position n.

Examples :

Input: n = 3
Output: false
Explanation: The frog can't reach the position 3.
Input: n = 2
Output: true
Explanation: The frog jumps from position 0 to 1 in its first jump. Since it is now at position 1, its next jump length is 1, taking it to position 2. Therefore, the frog can reach position 2.
Constraints:
1 ≤ n ≤ 109


*/

public class _25_Target_With_Jumps_Equal_Positions {

    public static boolean canJump(int n) {
        // code here
        if (n == 1)
            return true;

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(canJump(16));
        System.out.println(canJump(64));
        System.out.println(canJump(15));
    }
}