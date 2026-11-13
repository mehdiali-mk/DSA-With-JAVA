public class _47_Minimum_Operations {
    public static int minOps(int[] arr, int k) {
        // code here
        int minimumOperations = 0;

        for (int element : arr) {
            if (element > k) {
                minimumOperations += (element - 1) / k;
            }
        }

        return minimumOperations;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 2, 6, 4, 8, 1, 6 };

        System.out.println(minOps(myArray, 4));
    }
}
