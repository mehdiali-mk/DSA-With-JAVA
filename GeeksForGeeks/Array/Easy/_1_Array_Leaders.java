import java.util.ArrayList;
import java.util.Collections;

public class _1_Array_Leaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> result = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];
        result.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];

                result.add(maxFromRight);
            }
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 16, 17, 4, 3, 5, 2 };

        System.out.println(leaders(myArray));
    }
}
