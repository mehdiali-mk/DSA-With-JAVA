import java.util.ArrayList;
import java.util.HashSet;

public class _25_Remove_Duplicates {
    public static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        // ArrayList<Integer> result = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (!result.contains(arr[i])) {
        // result.add(arr[i]);
        // }
        // }

        // return result;

        ArrayList<Integer> result = new ArrayList<>();

        HashSet<Integer> myHashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (myHashSet.add(arr[i])) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String args[]) {

        int myArray[] = new int[] { 1, 2, 3, 1, 4, 2 };

        System.out.println(removeDuplicate(myArray));
    }
}
