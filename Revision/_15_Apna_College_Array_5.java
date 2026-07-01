import java.util.Scanner;

public class _15_Apna_College_Array_5 {

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

        System.out.println("\nPrint Max Sub Array:\n\n");
        maxSubArray(myArray);

        System.out.println("\nKadane's Algorithm:");
        int maxSum = maxSumSubArray(myArray);
        System.out.println("Maximum Sum SumArray = " + maxSum);
    }

    public static int maxSumSubArray(int myArray[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            currentSum += myArray[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void maxSubArray(int myArray[]) {
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        int prefixArray[] = new int[myArray.length];
        prefixArray[0] = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + myArray[i];
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length; j++) {
                int currentSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
        System.out.print("Sub Array: ");
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(myArray[i] + (i < end ? ", " : " "));
        }
        System.out.println("]");
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}