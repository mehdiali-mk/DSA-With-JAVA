public class _52_Count_Digit_4_To_N {

    public static int countNumbersWith4(int n) {

        int target = n + 1;
        int numbersNotContains4 = 0;

        int positionValue = 1;

        while (target > 0) {
            int currentDigit = target % 10;

            if (currentDigit < 4) {
                numbersNotContains4 += currentDigit * positionValue;
            } else if (currentDigit > 4) {
                numbersNotContains4 += (currentDigit - 1) * positionValue;
            } else {

                numbersNotContains4 = 4 * positionValue;
            }

            positionValue *= 9;
            target /= 10;
        }

        return (n + 1) - numbersNotContains4;
    }

    public static void main(String args[]) {
        System.out.println(countNumbersWith4(352));
    }
}