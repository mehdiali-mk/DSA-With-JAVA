package Backtracking;

public class _02_FindSubset {
    public static void findSubSet(String mainString, String answerString, int characterNumber) {
        if (characterNumber == mainString.length()) {
            if (answerString.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(answerString);
            }
            return;
        }

        findSubSet(mainString, answerString + mainString.charAt(characterNumber), characterNumber + 1);
        findSubSet(mainString, answerString, characterNumber + 1);
    }

    public static void main(String args[]) {
        System.out.println("\n\nSubset of string 'abc':");
        findSubSet("abc", "", 0);
        System.out.println("\n\n");
    }
}
