import java.util.ArrayList;
import java.util.Arrays;

public class _60_Pain_In_Both {
    public static ArrayList<ArrayList<Integer>> arrayOfPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0, j = arr.length - 1; i < (arr.length + 1) / 2; i++, j--) {
            result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j])));
        }

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(arrayOfPairs(myArray));
    }
}
