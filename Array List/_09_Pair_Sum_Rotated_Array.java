import java.util.ArrayList;

public class _09_Pair_Sum_Rotated_Array {

    public static int[] findPairSum(ArrayList<Integer> myArrayList, int targetSum) {
        int pivot = -1;
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) > myArrayList.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int leftPointer = pivot + 1;
        int rightPointer = pivot;
        int position[] = new int[2];

        while (leftPointer != rightPointer) {
            int currentSum = myArrayList.get(leftPointer) + myArrayList.get(rightPointer);
            if (currentSum == targetSum) {
                position[0] = leftPointer;
                position[1] = rightPointer;
                return position;
            } else if (currentSum < targetSum) {
                leftPointer = (leftPointer + 1) % myArrayList.size();
            } else {
                rightPointer = (myArrayList.size() + rightPointer - 1) % myArrayList.size();
            }
        }

        position[0] = 0;
        position[1] = 0;
        return position;
    }

    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(11);
        myArrayList.add(15);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(10);

        System.out.println("\n\nOriginal ArrayList:\n" + myArrayList);

        // System.out.println(findPairSum(myArrayList, 5));
        int position[] = findPairSum(myArrayList, 16);
        System.out.println("\nPair having sum of 16:");
        System.out.println("( " + myArrayList.get(position[0]) + ", " +
                myArrayList.get(position[1]) + " ) = "
                + (myArrayList.get(position[0]) + myArrayList.get(position[1])) + "\n\n");

    }
}
