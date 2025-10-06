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
