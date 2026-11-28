import java.util.ArrayList;

public class _2_Duplicate_In_Range {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            int idx = val - 1;

            if (arr[idx] < 0) {
                res.add(val);
            } else {
                arr[idx] = -arr[idx];
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 2, 3, 1, 2, 3 };

        System.out.println(findDuplicates(myArray));
    }
}