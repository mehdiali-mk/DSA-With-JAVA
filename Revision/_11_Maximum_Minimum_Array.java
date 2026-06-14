import java.util.Scanner;

public class _11_Maximum_Minimum_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int myArray[] = new int[50];

        System.out.print("\n\nEnter the size of an array = ");
        int sizeOfArray = sc.nextInt();

        System.out.println("\nEnter " + sizeOfArray + " array elements.\n");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element [" + i + "] = ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("\nOriginal Array = ");
        printArray(myArray, sizeOfArray);

        int maximumMinimum[] = findMaximumMinimum(myArray, sizeOfArray);

        System.out.println("\nMaximum Element = " + maximumMinimum[0]);
        System.out.println("Minimum Element = " + maximumMinimum[1]);

        System.out.println("\n\n");
    }

    public static int[] findMaximumMinimum(int myArray[], int sizeOfArray) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < sizeOfArray; i++) {
            if (myArray[i] > maximum) {
                maximum = myArray[i];
            }
            if (myArray[i] < minimum) {
                minimum = myArray[i];
            }
        }

        int[] values = { maximum, minimum };
        return values;
        // return int[] {maximum, minimum};
    }

    public static void printArray(int myArray[], int sizeOfArray) {
        System.out.print("[ ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");
    }
}
