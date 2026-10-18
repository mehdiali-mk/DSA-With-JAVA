import java.util.ArrayList;
import java.util.List;

public class _2_Min_Max_In_Array {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
            if (arr[min] > arr[i]) {
                min = i;
            }
        }

        return new ArrayList<Integer>(List.of(arr[min], arr[max]));
    }

    public static void main(String args[]) {
        System.out.println(getMinMax(new int[] { 2, 3, 4, 50, 6, -2 }));
    }
}
