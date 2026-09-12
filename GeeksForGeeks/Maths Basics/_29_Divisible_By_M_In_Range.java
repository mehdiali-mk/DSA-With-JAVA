/*

Divisible by M in a Range
Difficulty: BasicAccuracy: 54.58%Submissions: 11K+Points: 1
Given two numbers a and b which define a range, where a ≤ b. Find the count of total numbers in the given range [a … b] divisible by m.

Examples:

Input: a = 6, b = 15, m = 3
Output: 4 
Explanation: 6, 9, 12, 15 are divisible by 3. Hence answer is 4.
Input: a = 25, b = 100, m = 30
Output: 3
Explanation: 30, 60, 90 are divisible by 30. Hence answer is 3.
Constraints:
1 ≤ a, b, m ≤ 106



*/

public class _29_Divisible_By_M_In_Range {

    public static int countDivisibles(int a, int b, int m) {
        // code here
        if (m > b || a > b) {
            return 0;
        }

        int currentNumber = a;

        if (m > a) {
            currentNumber = m;
        }

        while (currentNumber % m != 0) {
            currentNumber++;
        }

        int totalCount = 0;
        while (currentNumber <= b) {
            totalCount++;
            currentNumber = currentNumber + m;
        }

        return totalCount;
    }

    public static void main(String args[]) {
        System.out.println(countDivisibles(25, 100, 30));
    }
}
