import java.util.ArrayList;
import java.util.Arrays;

public class _29_Even_Odd {

    public static void segregateEvenOdd(int arr[]) {
        // code here

        Arrays.sort(arr);

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        int index = 0;
        for (int num : evens) {
            arr[index++] = num;
        }
        for (int num : odds) {
            arr[index++] = num;
        }
    }

    public static void displayArray(int array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 12, 34, 45, 9, 8, 90, 3 };

        displayArray(myArray);
        segregateEvenOdd(myArray);
        displayArray(myArray);
    }
}
