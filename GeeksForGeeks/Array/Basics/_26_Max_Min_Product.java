public class _26_Max_Min_Product {

    public static long minMaxProduct(int[] arr1, int[] arr2) {
        // code here

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int i;

        for (i = 0; i < arr1.length && i < arr2.length; i++) {
            if (arr1[i] > maxValue) {
                maxValue = arr1[i];
            }
            if (arr2[i] < minValue) {
                minValue = arr2[i];
            }
        }

        while (i < arr1.length) {
            if (arr1[i] > maxValue) {
                maxValue = arr1[i];
            }
            i++;
        }

        while (i < arr2.length) {
            if (arr2[i] < minValue) {
                minValue = arr2[i];
            }
            i++;
        }

        return (long) maxValue * minValue;
    }

    public static void main(String args[]) {

        int myArray1[] = new int[] { 1, 9 };
        int myArray2[] = new int[] { 2, 8, 1, 1, 2, 10, 3, 2, 5 };

        System.out.println(minMaxProduct(myArray1, myArray2));

    }
}
