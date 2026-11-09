public class _41_Remove_Sandwich {

    public static String sandwichedVowel(String s) {
        // code here
        if (s == null || s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (isVowel(s.charAt(i))) {
                if (!isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {
                    continue;
                }
            }
            sb.append(s.charAt(i));
        }

        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }

    public static boolean isVowel(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(sandwichedVowel("bab"));
    }
}
