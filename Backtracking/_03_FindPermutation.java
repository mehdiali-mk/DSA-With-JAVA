package Backtracking;

public class _03_FindPermutation {

    public static void findPermutation(String mainString, String answerString) {
        if (mainString.length() == 0) {
            System.out.println(answerString);
            return;
        }

        for (int i = 0; i < mainString.length(); i++) {
            findPermutation(mainString.substring(0, i) + mainString.substring(i + 1, mainString.length()),
                    answerString + mainString.charAt(i));
        }
    }

    public static void main(String args[]) {

        System.out.println("\n\nPermutation of 'abc':");
        findPermutation("abc", "");
        System.out.println("\n\n");
    }
}