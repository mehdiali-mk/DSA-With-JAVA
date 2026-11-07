public class _37_Last_Duplicate {

    public static int[] dupLastIndex(int[] arr) {
        // Complete the function
        int result[] = new int[] { -1, -1 };

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                result[0] = i;
                result[1] = arr[i];
                break;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 3, 4, 5 };
        int result[] = dupLastIndex(myArray);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
