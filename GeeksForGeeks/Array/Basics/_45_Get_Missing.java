import java.util.HashSet;

public class _45_Get_Missing {

    public static int findMissing(int[] arr1, int[] arr2) {
        // code here
        int missingElement = 0;

        for (int element : arr1) {
            missingElement ^= element;
        }

        for (int element : arr2) {
            missingElement ^= element;
        }

        return missingElement;
    }

    public static void main(String args[]) {
        int myArray1[] = new int[] { 4, 8, 1, 3, 7 };
        int myArray2[] = new int[] { 7, 4, 3, 1 };

        System.out.println(findMissing(myArray1, myArray2));
    }
}