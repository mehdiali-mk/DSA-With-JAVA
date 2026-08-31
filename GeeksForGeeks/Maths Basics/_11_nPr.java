public class _11_nPr {
    public static long nPr(int n, int r) {
        // code here
        return factorial(n) / factorial(n - r);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String args[]) {
        System.out.println(nPr(5, 2));
    }
}
