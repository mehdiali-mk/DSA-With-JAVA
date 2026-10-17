public class _0_Temp {
    public static int findGCD(int a, int b) {

        if (b == 0) {
            return Math.abs(a);
        }

        return findGCD(b, a % b);
    }

    public static void main(String args[]) {

    }
}