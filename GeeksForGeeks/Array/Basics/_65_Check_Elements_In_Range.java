import java.util.Arrays;

public class _65_Check_Elements_In_Range {

    public static boolean checkElements(int start, int end, int[] arr) {
        int rangeSize = end - start + 1;

        if (arr == null || arr.length < rangeSize) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] >= start && arr[i] <= end) {
                int correctIndex = arr[i] - start;

                if (arr[i] == arr[correctIndex]) {
                    break;
                }

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        for (int i = 0; i < rangeSize; i++) {
            if (arr[i] != start + i) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 4, 5, 2, 7, 8, 3 };
        System.out.println(checkElements(2, 5, myArray));
    }
}