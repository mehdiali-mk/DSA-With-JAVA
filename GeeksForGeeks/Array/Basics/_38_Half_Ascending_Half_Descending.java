import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _38_Half_Ascending_Half_Descending {

    public static ArrayList<Integer> customSort(int[] arr) {
        // code here
        ArrayList<Integer> myResult = new ArrayList<>();

        int[] ascendingArray = Arrays.copyOfRange(arr, 0, arr.length / 2);
        Arrays.sort(ascendingArray);

        Integer[] descendingArray = Arrays.stream(arr, arr.length / 2, arr.length)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(descendingArray, Collections.reverseOrder());

        for (int num : ascendingArray) {
            myResult.add(num);
        }

        for (int num : descendingArray) {
            myResult.add(num);
        }

        return myResult;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 10, 20, 30, 40 };

        System.out.println(customSort(myArray));
    }
}
