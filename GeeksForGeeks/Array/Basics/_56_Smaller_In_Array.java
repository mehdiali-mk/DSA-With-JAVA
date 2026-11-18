import java.util.ArrayList;

public class _56_Smaller_In_Array {

    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // code here
        ArrayList<Integer> smallerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                smallerList.add(arr[i]);
            }
        }
        return smallerList;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 54, 43, 2, 1, 5 };

        System.out.println(getSmaller(myArray, 7));
    }
}