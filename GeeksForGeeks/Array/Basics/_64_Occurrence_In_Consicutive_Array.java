import java.util.Arrays;
import java.util.HashSet;

public class _64_Occurrence_In_Consicutive_Array {

    public static int specialIntegers(int[] arr) {
        // code here
        if (arr == null || arr.length < 3) {
            return 0;
        }

        HashSet<Integer> myHashSet = new HashSet<>();

        for (int element : arr) {
            myHashSet.add(element);
        }

        int specialIntegerCount = 0;

        for (int x : myHashSet) {
            if (myHashSet.contains(x - 1) && myHashSet.contains(x + 1)) {
                specialIntegerCount++;
            }
        }

        return specialIntegerCount;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 2, 3, 5, 7 };
        System.out.println(specialIntegers(myArray));
    }
}
