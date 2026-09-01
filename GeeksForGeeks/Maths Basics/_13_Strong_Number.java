public class _13_Strong_Number {
    private static final int[] FACTORIALS = {
            1,
            1,
            2,
            6,
            24,
            120,
            720,
            5040,
            40320,
            362880
    };

    public static boolean isStrong(int n) {
        int tempNumber = n;
        int result = 0;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            result += FACTORIALS[digit];
            tempNumber /= 10;
        }

        return result == n;
    }

    public static void main(String args[]) {
        System.out.println(isStrong(145));
    }
}