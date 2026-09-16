/*

Pronic Number
Difficulty: BasicAccuracy: 39.44%Submissions: 7K+Points: 1
Given an integer n, find all Pronic Numbers less than or equal to n. A Pronic Number is a number that can be expressed as the product of two consecutive integers, i.e., i × (i + 1) for some non-negative integer i. Return all such Pronic Numbers in increasing order.

Examples:

Input: n = 6
Output: 0 2 6
Explanation: 0 is the product of 0 and 1. 2 is the product of 1 and 2. 6 is the product of 2 and 3.
Input: n = 56
Output: 0 2 6 12 20 30 42 56
Explanation: 
0 is the product of 0 and 1. 
2 is the product of 1 and 2. 
6 is the product of 2 and 3. 
12 is the product of 3 and 4. and so on.
Constraints: 
0 ≤ n ≤ 109

*/

import java.util.ArrayList;

public class _35_Pronic_Number {

    public static ArrayList<Integer> pronicNumbers(int n) {
        // code here
        ArrayList<Integer> allPronicNumbers = new ArrayList<>();
        for (int i = 0; i * (i + 1) <= n; i++) {
            allPronicNumbers.add(i * (i + 1));
        }
        return allPronicNumbers;
    }

    public static void main(String args[]) {
        System.out.println(pronicNumbers(541));
    }
}