import java.util.Scanner;

public class _15_Apna_College_Array_2 {

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

        reverseArray(myArray);
        System.out.print("Reverse  Array = ");
        printArray(myArray);

    }

    public static void reverseArray(int myArray[]) {
        int start = 0, end = myArray.length - 1;

        while (start < end) {
            myArray[start] = myArray[start] + myArray[end];
            myArray[end] = myArray[start] - myArray[end];
            myArray[start] = myArray[start] - myArray[end];

            start++;
            end--;
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