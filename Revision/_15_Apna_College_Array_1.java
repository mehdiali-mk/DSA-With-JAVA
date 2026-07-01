import java.util.Scanner;

public class _15_Apna_College_Array_1 {
    public static int binarySearch(int myArray[], int key) {
        int start = 0, end = myArray.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (myArray[mid] == key) {
                return mid;
            } else if (myArray[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

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

        sortArray(myArray);
        System.out.print("Sorted Array = ");
        printArray(myArray);

        System.out.print("\n\nEnter the key to find = ");
        int myKey = sc.nextInt();

        int keyIndex = binarySearch(myArray, myKey);

        if (keyIndex == -1) {
            System.out.println(myKey + " Key not found in array.");
        } else {
            System.out.println("Key " + myKey + " found at " + keyIndex + ".\n\n");
        }
    }

    public static void sortArray(int[] myArray) {
        // 1. Guard clause to handle null or empty arrays safely
        if (myArray == null || myArray.length <= 1) {
            return;
        }

        boolean swap; // 2. No need to initialize to false here

        for (int i = 0; i < myArray.length - 1; i++) {
            swap = false;

            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}