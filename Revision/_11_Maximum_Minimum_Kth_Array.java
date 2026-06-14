import java.util.Scanner;

public class _11_Maximum_Minimum_Kth_Array {
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
        System.out.print("\nEnter the kth Element = ");
        int kth = sc.nextInt();

        System.out.print("\nOriginal Array = ");
        printArray(myArray, sizeOfArray);

        int maximumMinimum[] = findMaximumMinimum(myArray, sizeOfArray, kth);

        System.out.print("\nSorted Array = ");
        printArray(myArray, sizeOfArray);

        System.out.println("\n\n" + kth + " Maximum Element = " + maximumMinimum[0]);
        System.out.println(kth + " Minimum Element = " + maximumMinimum[1]);

        System.out.println("\n\n");
    }

    public static int[] findMaximumMinimum(int myArray[], int sizeOfArray, int kth) {
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = i; j < sizeOfArray; j++) {
                if (myArray[i] > myArray[j]) {
                    myArray[i] = myArray[i] + myArray[j];
                    myArray[j] = myArray[i] - myArray[j];
                    myArray[i] = myArray[i] - myArray[j];
                }
            }
        }

        int[] values = { myArray[sizeOfArray - kth], myArray[kth - 1] };
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
