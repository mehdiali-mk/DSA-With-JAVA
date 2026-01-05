/*

Question 3
Lexicographically smallest string of length N and sum K
We have two integers N and K. The task is to print the lexicographically smallest string of
length N consisting of lower-case English alphabets such that the sum of the characters of
the string equals to k where 'a' = 1, 'b = 2, 'c' = 3,
and 'z' = 26.
Sample Input 1 : N = 5, K = 42
Sample Output 1 : aaamz
Sample Input 2 : N = 3, K = 25
Sample Output 2 : aaw

*/

import java.util.Arrays;

public class _10_LexoGraphycally_Smallest_String {

    public static char[] lexographycallySmallestString(int number, int sum) {
        char arr[] = new char[number];

        Arrays.fill(arr, 'a');

        for (int i = number - 1; i >= 0; i--) {
            sum -= i;
            if (sum >= 0) {
                if (sum >= 26) {
                    arr[i] = 'z';
                    sum -= 26;
                } else {
                    arr[i] = (char) (sum + 97 - 1);
                    sum -= arr[i] - 'a' + 1;
                }
            } else {
                break;
            }
            sum += i;
        }
        return arr;
    }

    public static void main(String args[]) {
        int number = 5, sum = 42;
        int number2 = 3, sum2 = 25;

        char arr[] = lexographycallySmallestString(number, sum);
        char arr2[] = lexographycallySmallestString(number2, sum2);

        System.out.println("\n\n\nFor number = " + number + " and Sum = " + sum + ":");
        System.out.println(new String(arr));
        System.out.println("\nFor number = " + number2 + " and Sum = " + sum2 + ":");
        System.out.println(new String(arr2));
        System.out.println("\n\n\n");
    }
}
