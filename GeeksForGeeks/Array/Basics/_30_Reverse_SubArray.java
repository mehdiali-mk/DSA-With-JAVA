import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _30_Reverse_SubArray {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
            int r) {
        // code here

        int i = l - 1;
        int j = r - 1;
        while (i < j && i < arr.size() && j >= 0) {
            Collections.swap(arr, i, j);
            i++;
            j--;
        }

        return arr;
    }

    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        System.out.println(myArrayList);
        reverseSubArray(myArrayList, 2, 4);
        System.out.println(myArrayList);
    }
}
