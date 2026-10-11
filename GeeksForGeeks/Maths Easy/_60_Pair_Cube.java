public class _60_Pair_Cube {
    public static int pairCubeCount(int n) {
        // code here

        int count = 0;

        for (int a = 1; a * a * a <= n; a++) {
            int aCube = a * a * a;

            int diff = n - aCube;

            int b = (int) Math.round(Math.cbrt(diff));

            if (b * b * b == diff) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
    }
}
