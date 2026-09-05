public class _19_Sum_Of_GP {
    public static int sumOfGP(int n, int a, int r) {
        // code here

        if (r == 1) {
            return a * n;
        }

        long rToPowerN = (long) Math.pow(r, n);
        return (int) (a * (rToPowerN - 1) / (r - 1));
    }

    public static void main(String args[]) {
        System.out.println(sumOfGP(3, 1, 2));
    }
}
