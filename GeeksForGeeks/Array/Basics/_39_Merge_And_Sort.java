import java.util.ArrayList;
import java.util.Arrays;

public class _39_Merge_And_Sort {

    public static ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here

        ArrayList<Integer> myResult = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {

                if (myResult.isEmpty() || myResult.get(myResult.size() - 1) != arr1[i]) {
                    myResult.add(arr1[i]);
                }
                i++;
            } else {
                if (myResult.isEmpty() || myResult.get(myResult.size() - 1) != arr2[j]) {
                    myResult.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (myResult.isEmpty() || myResult.get(myResult.size() - 1) != arr1[i]) {
                myResult.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (myResult.isEmpty() || myResult.get(myResult.size() - 1) != arr2[j]) {
                myResult.add(arr2[j]);
            }
            j++;
        }

        return myResult;
    }

    public static void main(String args[]) {
        int myArray1[] = new int[] { 11, 1, 8 };
        int myArray2[] = new int[] { 10, 11 };

        System.out.println(mergeNsort(myArray1, myArray2));
    }
}
