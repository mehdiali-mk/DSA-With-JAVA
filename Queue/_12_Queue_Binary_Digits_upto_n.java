/*

Question 1 :
Generate Binary Numbers
Given a number N. The task is to generate and print all binary numbers with decimal values from
1 to N.
Sample Input 1 : N =2
Sample Output 1 : 1 10
Sample Input 2 : 5.
Sample Output 2 : 1 10 11 100 101

*/

import java.util.LinkedList;
import java.util.Queue;

public class _12_Queue_Binary_Digits_upto_n {

    static void generateBinaryNumbers(int number) {
        Queue<String> myQueue = new LinkedList<String>();
        myQueue.add("1");
        System.out.print(" [");
        while (number-- > 0) {
            String s1 = myQueue.peek();
            myQueue.remove();
            System.out.print(" " + s1);
            String s2 = s1;
            myQueue.add(s1 + "0");
            myQueue.add(s2 + "1");
        }
        System.out.println(" ]");
    }

    public static void main(String args[]) {
        System.out.print("\n\nGenerate 5 Binary Numbers:\n");
        generateBinaryNumbers(5);
        System.out.print("\nGenerate 3 Binary Numbers\n");
        generateBinaryNumbers(3);
        System.out.print("\nGenerate 7 Binary Numbers\n");
        generateBinaryNumbers(7);
        System.out.println("\n\n");

    }
}
