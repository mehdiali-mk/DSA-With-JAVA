import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _61_HashTable_Two_Sum {
    public static void main(String args[]) {
        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        int target = 100;

        System.out.println("\n\n");
        System.out.println("Original Array = " + Arrays.toString(myArray));
        System.out.println("\n");
        System.out.println("Find Two Sum for " + target + ":");
        int[] twoSumIndex = findTwoSum(myArray, target);
        if (twoSumIndex.length == 0) {
            System.out.println("\nTwo numbers can't sum up " + target + ".");
        } else {
            System.out.println("\nThe number " + myArray[twoSumIndex[0]] + " at index " + twoSumIndex[0]
                    + " and " + myArray[twoSumIndex[1]] + " at index " + twoSumIndex[1] + " sum up to " + target);
        }
    }

    public static int[] findTwoSum(int[] myArray, int target) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i = 0; i < myArray.length; i++) {
            int complement = target - myArray[i];
            if (myHashMap.containsKey(complement)) {
                return new int[] { myHashMap.get(complement), i };
            } else {
                myHashMap.put(myArray[i], i);
            }
        }

        return new int[] {};
    }
}
