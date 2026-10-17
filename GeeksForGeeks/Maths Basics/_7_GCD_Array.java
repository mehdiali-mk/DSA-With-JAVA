/*
GCD of Array

Given an array of n positive integers, find the GCD of all the array elements.

Example :

Input: n = 3, arr = [1, 2, 3]
Output: 1
Explanation: GCD of 1,2,3 is 1.
Input: n = 4, arr = [2, 4, 6, 8]
Output: 2
Explanation: Greatest common divisor of all the numbers is 2.

*/

public class _7_GCD_Array {
    public static int gcd(int n, int arr[]) {
        // code here.
        if (arr == null || n == 0) {
            return 0;
        }

        int result = arr[0];

        for (int i = 0; i < n; i++) {
            result = findGCD(result, arr[i]);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int tempNumber = num2;
            num2 = num1 % num2;
            num1 = tempNumber;
        }
        return num1;
    }
}
