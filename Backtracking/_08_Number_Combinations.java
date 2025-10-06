/*
 *  Keypad Combinations
    Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    Sample Input 1 : digits = "23"
    Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
    
    Sample Input 2 : digits = "2"
    Sample Output 2 : "a", "b", "c"

    Sample Input 3 : digits = ""
    Sample Output 3 : ””

 */

package Backtracking;

public class _08_Number_Combinations {

    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void lettersCombination(String lettersString) {
        if (lettersString.length() == 0) {
            System.out.println("''");
            return;
        }

        breathFirstSearch(0, lettersString.length(), new StringBuilder(), lettersString);
    }

    public static void breathFirstSearch(int currentPosition, int lengthOfString, StringBuilder sb,
            String lettersString) {
        if (currentPosition == lengthOfString) {
            System.out.println(sb.toString());
        } else {
            char[] letters = L[Character.getNumericValue(lettersString.charAt(currentPosition))];
            for (int i = 0; i < letters.length; i++) {
                breathFirstSearch(currentPosition + 1, lengthOfString, new StringBuilder(sb).append(letters[i]),
                        lettersString);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\nLetters Combination into Letters:\n");
        lettersCombination("23");
        System.out.println("\n\n");
    }
}
