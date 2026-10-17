import java.util.Arrays;

public class _71_Max_Product_Sum {
    public static int maxProductSum(int[] a, int[] b) {
        // code here

        Arrays.sort(a);
        Arrays.sort(b);

        int product = 0;
        for (int i = 0; i < a.length; i++) {
            product += (a[i] * b[i]);
        }

        return product;
    }

    public static void main(String args[]) {
    }
}
