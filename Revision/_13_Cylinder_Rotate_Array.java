import java.util.Scanner;

public class _13_Cylinder_Rotate_Array {
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

        cylinderRotate(myArray, sizeOfArray);

        System.out.print("\nAfter Cylinder Rotate Array = ");
        printArray(myArray, sizeOfArray);
    }

    public static void cylinderRotate(int myArray[], int sizeOfArray) {
        for (int i = 0, j = sizeOfArray - 1; i < sizeOfArray / 2; i++, j--) {
            myArray[i] = myArray[i] + myArray[j];
            myArray[j] = myArray[i] - myArray[j];
            myArray[i] = myArray[i] - myArray[j];
        }

        for (int i = 1, j = sizeOfArray - 1; i < (sizeOfArray + 1) / 2; i++, j--) {
            myArray[i] = myArray[i] + myArray[j];
            myArray[j] = myArray[i] - myArray[j];
            myArray[i] = myArray[i] - myArray[j];
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
