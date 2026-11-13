public class _46_Maximum_Contigious_K_Product {

    public static int findMaxProduct(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1;
        }

        long maxProduct = Long.MIN_VALUE;
        long currentProduct = 1;
        int zeroCount = 0;

        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                currentProduct *= arr[i];
            }
        }

        maxProduct = (zeroCount > 0) ? 0 : currentProduct;

        for (int i = k; i < arr.length; i++) {
            int outgoing = arr[i - k];
            int incoming = arr[i];

            if (outgoing == 0) {
                zeroCount--;
            } else {
                currentProduct /= outgoing;
            }

            if (incoming == 0) {
                zeroCount++;
            } else {
                currentProduct *= incoming;
            }

            long actualWindowProduct = (zeroCount > 0) ? 0 : currentProduct;

            if (actualWindowProduct > maxProduct) {
                maxProduct = actualWindowProduct;
            }
        }

        return (int) maxProduct;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 3, 4 };

        System.out.println(findMaxProduct(myArray, 2));
    }
}