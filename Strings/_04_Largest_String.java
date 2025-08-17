// For a given set of Strings, print the largest string.
// "apple", "mango", "banana"
// We can also use .compareTo() and .compareToIgnorecase().

package Strings;

public class _04_Largest_String {
    public static String findLargestString(String array[]) {
        String largestString = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largestString.compareTo(array[i]) < 0) {
                largestString = array[i];
            }
        }

        return largestString;
    }

    public static void main(String args[]) {
        String array[] = { "apple", "mango", "banana", "pineapple" };

        System.out.println("\nLargest String = " + findLargestString(array) + "\n\n");
    }
}
