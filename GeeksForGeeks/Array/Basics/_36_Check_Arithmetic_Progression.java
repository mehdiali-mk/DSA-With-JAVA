import java.util.Arrays;

public class _36_Check_Arithmetic_Progression {

    public static boolean checkIsAP(int[] arr) {
        // Your code goes here
        if (arr == null) {
            return false;
        }

        if (arr.length <= 2) {
            return true;
        }

        Arrays.sort(arr);

        int mainDifference = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (mainDifference != arr[i] - arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 0, 12, 4, 8 };
        System.out.println(checkIsAP(myArray));
    }
}