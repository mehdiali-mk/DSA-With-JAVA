import java.util.ArrayList;
import java.util.Arrays;

public class _27_Alternative_Sorting {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0, j = arr.length - 1; i < (arr.length / 2); i++, j--) {
            result.add(arr[j]);
            result.add(arr[i]);
        }

        if (arr.length % 2 != 0) {
            result.add(arr[arr.length / 2]);
        }

        return result;
    }

    public static void displayArray(int array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {

        int myArray[] = new int[] { 7, 1, 2, 3, 4, 5, 6 };
        System.out.println(alternateSort(myArray));
    }
}
