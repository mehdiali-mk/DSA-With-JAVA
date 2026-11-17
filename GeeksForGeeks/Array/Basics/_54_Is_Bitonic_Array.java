public class _54_Is_Bitonic_Array {

    public static boolean isPerfect(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return false;
        }

        int currentElement = arr[0];
        int i = 1;
        while (i < arr.length && currentElement < arr[i]) {
            currentElement = arr[i];
            i++;
        }

        while (i < arr.length && currentElement == arr[i]) {
            i++;
        }

        while (i < arr.length && currentElement > arr[i]) {
            currentElement = arr[i];
            i++;
        }

        if (i == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        // int myArray[] = new int[] { 1, 8, 8, 8, 3, 2 };
        int myArray[] = new int[] { 1, 5, 9, 6, 3 };

        System.out.println(isPerfect(myArray));
    }
}
