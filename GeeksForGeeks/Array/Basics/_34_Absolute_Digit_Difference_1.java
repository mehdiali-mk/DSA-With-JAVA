import java.util.ArrayList;

public class _34_Absolute_Digit_Difference_1 {

    public static int[] getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        ArrayList<Integer> myResult = new ArrayList<>();

        for (int element : arr) {
            if (element < k && element / 10 != 0 && hasDigitDiff1(element)) {
                myResult.add(element);
            }
        }

        return myResult.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean hasDigitDiff1(int element) {
        element = Math.abs(element);

        int previousDigit = element % 10;
        element /= 10;

        while (element > 0) {
            int currentDigit = element % 10;

            if (Math.abs(currentDigit - previousDigit) != 1) {
                return false;
            }

            previousDigit = currentDigit;
            element /= 10;
        }

        return true;
    }

    public static void displayArray(int array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 87, 89, 45, 235, 465, 765, 123, 987, 499, 655 };
        displayArray(getDigitDiff1AndLessK(myArray, 1000));
    }
}