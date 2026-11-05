import java.util.HashSet;

public class _33_Sum_Of_Distinct {

    public static int findSum(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return 0;
        }

        HashSet<Integer> myHashSet = new HashSet<>();
        int totalSum = 0;
        for (int element : arr) {
            if (myHashSet.add(element)) {
                totalSum += element;
            }
        }

        return totalSum;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 5, 5, 5, 5, 5 };

        System.out.println(findSum(myArray));
    }
}