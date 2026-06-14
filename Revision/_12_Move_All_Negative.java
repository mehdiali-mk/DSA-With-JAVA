import java.util.Scanner;

public class _12_Move_All_Negative {
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

        moveAllNegative(myArray, sizeOfArray);

        System.out.print("\nRefined Array = ");
        printArray(myArray, sizeOfArray);

        System.out.println("\n\n");
    }

    public static void moveAllNegative(int myArray[], int sizeOfArray) {
        for (int i = 0, j = 0; i < sizeOfArray; i++) {
            if (myArray[i] < 0) {
                if (i == j) {
                    j++;
                    continue;
                }
                myArray[i] = myArray[i] + myArray[j];
                myArray[j] = myArray[i] - myArray[j];
                myArray[i] = myArray[i] - myArray[j];
                j++;
            }
        }
    }

    public static void printArray(int myArray[], int sizeOfArray) {
        System.out.print("[ ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");
    }
}
