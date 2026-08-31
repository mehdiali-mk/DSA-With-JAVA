/*

Sum of AP series
Solved
Difficulty: BasicAccuracy: 31.98%Submissions: 44K+Points: 1
A series with same common difference is known as arithmetic series. The first term of series is 'a' and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series upto nth term.

*/

public class _10_Sum_Of_Ap_Series {
    public static int sumOfAP(int n, int a, int d) {
        // code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a + i * d;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfAP(5, 1, 3));
    }
}