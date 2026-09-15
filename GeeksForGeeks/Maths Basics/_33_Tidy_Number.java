public class _33_Tidy_Number {
    public static boolean isTidy(int n) {
        // code here
        int previousNumber = Integer.MAX_VALUE;

        while (n != 0) {
            int reminder = n % 10;
            if (reminder > previousNumber) {
                return false;
            }
            previousNumber = reminder;
            n /= 10;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isTidy(1234));
    }
}