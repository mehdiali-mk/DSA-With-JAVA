import java.util.ArrayList;
import java.util.List;

public class _16_Kth_From_Start_End {
    public static void swapKth(List<Integer> arr, int k) {
        // code here
        if (arr == null || k <= 0 || k > arr.size())
            return;

        int beginningIndex = k - 1;
        int endingIndex = arr.size() - k;

        if (beginningIndex != endingIndex) {
            int temp = arr.get(beginningIndex);
            arr.set(beginningIndex, arr.get(endingIndex));
            arr.set(endingIndex, temp);
        }
    }

    public static void main(String args[]) {
        List<Integer> myArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        swapKth(myArray, 3);
        System.out.println(myArray);
    }
}
