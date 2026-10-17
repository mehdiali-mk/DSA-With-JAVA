/*

Floyd's triangle

Given a number n, print Floyd's triangle with n lines.

Floyd’s Triangle is a pattern of consecutive natural numbers arranged in rows, where the i-th row contains i numbers.

Examples:

Input: n = 4
Output:
1
2 3
4 5 6
7 8 9 10
Explanation: The triangle has 4 rows. Numbers start from 1 and increase sequentially across rows, and each row i contains i elements.
Input: n = 5 
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Explanation: The triangle has 4 rows, and each row i contains i numbers.

*/

import java.util.Scanner;

public class _8_Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}