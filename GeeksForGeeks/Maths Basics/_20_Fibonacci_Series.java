/*

Check if the number is Fibonacci
Difficulty: BasicAccuracy: 51.19%Submissions: 23K+Points: 1
Given an integer n, find if it is a Fibonacci Number. 

Examples :

Input: n = 34
Output: true
Explanation: 34 is one of the numbers of the Fibonacci series.
Input: n = 41
Output: false
Explanation: 41 is not in the numbers of the Fibonacci series.
Constraints:
1 ≤ n ≤ 104

*/

public class _20_Fibonacci_Series {

    public static boolean isFibonacci(int n) {
        // code here
        if (n == 0 || n == 1)
            return true;

        int firstNumber = 0;
        int secondNumber = 1;

        while (secondNumber <= n) {

            if (secondNumber == n) {
                return true;
            }
            int tempNumber = secondNumber;
            secondNumber = secondNumber + firstNumber;
            firstNumber = tempNumber;
        }

        return false;
    }

    public static void main(String args[]) {
        System.out.println(isFibonacci(55));
    }
}