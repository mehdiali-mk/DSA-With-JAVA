public class _32_Limited_Digit_Count_Numbers {
    public static int findCountUpto(int d) {
        // code here
        int totalCountWithNonZero = 0;
        int lastNumber = 0;
        for (int i = 1; i <= d; i++) {
            lastNumber = lastNumber * 10 + 9;
            totalCountWithNonZero += Math.pow(9, i);
        }

        return lastNumber - totalCountWithNonZero;
    }

    public static void main(String args[]) {
        System.out.println(findCountUpto(1));
    }
}