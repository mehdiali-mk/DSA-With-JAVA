public class _54_OverLapping_Rectangles {

    public static int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here

        if ((L1[0] < R2[0] && L1[1] > R2[1]) || (L2[0] < R1[0] && L2[1] > R1[1])) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        int L1[] = new int[] { 0, 2 };
        int R1[] = new int[] { 1, 1 };
        int L2[] = new int[] { -2, 0 };
        int R2[] = new int[] { 0, -3 };

        System.out.println(doOverlap(L1, R1, L2, R2));
    }
}
