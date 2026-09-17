public class _37_Power_Of_4 {
    public static boolean isPowerOfFour(int n) {
        // code here
        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfFour(256));
    }
}
