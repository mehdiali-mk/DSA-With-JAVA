public class _30_Given_Base_to_Decimal_Conversion {

    public static int decimalEquivalent(String s, int b) {
        // code here
        int multiplier = 1;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentCharacter = s.charAt(i);
            System.out.println(currentCharacter);
            int value;
            if (currentCharacter >= '0' && currentCharacter <= '9') {
                value = (currentCharacter - '0');
            } else if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                value = (currentCharacter - 'A') + 10;
            } else {
                value = 0;
            }

            result += value * multiplier;

            multiplier *= b;
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(decimalEquivalent("ABC", 16));
    }
}
