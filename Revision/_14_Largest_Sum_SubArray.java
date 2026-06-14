import java.util.Scanner;

public class _14_Largest_Sum_SubArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the size of the array = ");
        int sizeOfArray = sc.nextInt();

        if (sizeOfArray <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int myArray[] = new int[sizeOfArray];

        System.out.println("\nEnter " + sizeOfArray + " array elements.\n");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element [" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("\nOriginal Array = ");
        printArray(myArray);

        int largestSumSubArray = findLargestSumSubArray(myArray);

        System.out.print("\nLargest Sum of Subarray = " + largestSumSubArray + "\n");
        sc.close();
    }

    public static int findLargestSumSubArray(int myArray[]) {
        if (myArray == null || myArray.length == 0) {
            return 0;
        }

        int currentSum = myArray[0];
        int maxSum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            currentSum = Math.max(myArray[i], currentSum + myArray[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}
