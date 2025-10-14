import java.util.ArrayList;

public class _08_Pair_Sum {
    public static int[] findPairSum(ArrayList<Integer> myArrayList, int targetSum) {
        int leftPointer = 0;
        int rightPointer = myArrayList.size() - 1;
        int position[] = new int[2];

        while (leftPointer < rightPointer) {
            int currentSum = myArrayList.get(leftPointer) + myArrayList.get(rightPointer);
            if (currentSum == targetSum) {
                position[0] = leftPointer;
                position[1] = rightPointer;

                return position;
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        position[0] = 0;
        position[1] = 0;
        return position;
        // return new Array([0, 0]);
        // return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);

        // System.out.println(findPairSum(myArrayList, 5));
        int position[] = findPairSum(myArrayList, 5);
        System.out.println("\n\nPair having sum of 5:");
        System.out.println("( " + myArrayList.get(position[0]) + ", " +
                myArrayList.get(position[1]) + " ) = "
                + (myArrayList.get(position[0]) + myArrayList.get(position[1])) + "\n\n");

    }
}