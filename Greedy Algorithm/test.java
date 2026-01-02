public class test {
    public static int kthOdd(int[] range, int K) {
        if (K <= 0)
            return 0;

        int L = range[0];
        int R = range[1];

        System.out.println(R & 1);

        if ((R & 1) > 0) {
            int Count = (int) Math.ceil((R - 1) / 2);

            if (K > Count)
                return 0;
            else
                return (R - 2 * K + 2);
        } else {
            int Count = (R - L + 1) / 2;

            if (K > Count)
                return 0;
            else
                return (R - 2 * K + 1);
        }
    }

    public static void main(String args[]) {
        int p[] = { -10, 10 };
        int k = 8;
        System.out.println(kthOdd(p, k));
    }
}
