import java.util.Scanner;

public class _19_SubArrays_Sum_K {
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

        System.out.print("\nEnter SubArrays Sum value for K = ");
        int kValue = sc.nextInt();

        System.out.println("\n\nSub Arrays having sum of " + kValue + ":");
        printSubArraySumK(myArray, kValue);
    }

    public static void printSubArraySumK(int myArray[], int kValue) {

        int countIterations = 0;
        for (int i = 0; i < myArray.length; i++) {
            int currentSum = 0;
            for (int j = i; j < myArray.length; j++) {
                currentSum += myArray[j];
                countIterations++;
                if (currentSum < (kValue / 2)) {
                    continue;
                } else if (currentSum > kValue) {
                    break;
                } else if (currentSum == kValue) {
                    System.out.print("[ ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(myArray[k] + (k <= j - 1 ? ", " : " "));
                    }
                    System.out.println("]");
                }
            }
            countIterations++;
        }
        System.out.println("\n\nTotal iterations = " + countIterations);
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}
