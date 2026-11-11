public class _43_Conditional_Pair {

    public static int minSum(int[] arr1, int[] arr2) {
        // code here
        int min1A = Integer.MAX_VALUE, min2A = Integer.MAX_VALUE;
        int min1B = Integer.MAX_VALUE, min2B = Integer.MAX_VALUE;

        int indexA = -1;
        int indexB = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min1A) {
                min2A = min1A;
                min1A = arr1[i];
                indexA = i;
            } else if (arr1[i] < min2A) {
                min2A = arr1[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min1B) {
                min2B = min1B;
                min1B = arr2[i];
                indexB = i;
            } else if (arr2[i] < min2B) {
                min2B = arr2[i];
            }
        }

        if (indexA != indexB) {
            return min1A + min1B;
        }

        return Math.min(min1A + min2B, min2A + min1B);
    }

    public static void main(String args[]) {
        int myArray1[] = new int[] { 5, 4, 13, 2, 1 };
        int myArray2[] = new int[] { 2, 3, 4, 6, 5 };

        System.out.println(minSum(myArray1, myArray2));
    }
}
