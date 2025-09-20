// Question 1:
// For a given integer array of size N. You have to find all the occurrences(indices) of a given element (Key) and print them. Use a recursive function to solve this problem.
// Sample Input : arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output: 1 5 7 8

package Recursion;

public class _15_Occurrence_Of_Number {
    static void findAllOccurrence(int array[], int currentIndex, int key) {
        if (currentIndex == array.length) {
            return;
        } else if (array[currentIndex] == key) {
            System.out.print(" " + currentIndex);
        }
        findAllOccurrence(array, currentIndex + 1, key);
    }

    public static void main(String args[]) {
        int array[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        System.out.println("\n\n\nThe Occurrence of 2 in array:");
        findAllOccurrence(array, 0, 2);
        System.out.println("\n\n\n");
    }
}
