public class _1_Middle_of_Three {

    public static int middle(int a, int b, int c) {
        // code here
        int maxNumber = Math.max(a, Math.max(b, c));
        int minNumber = Math.min(a, Math.min(b, c));

        if (a == maxNumber && b == minNumber || a == minNumber && b == maxNumber) {
            return c;
        } else if (b == maxNumber && c == minNumber || b == minNumber && c == maxNumber) {
            return a;
        } else if (a == maxNumber && c == minNumber || a == minNumber && c == maxNumber) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\n");
        System.out.println("Middle of Three Number: " + middle(162, 934, 200));
        System.out.println("\n\n");
    }

}
