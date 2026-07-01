import java.util.Scanner;

public class _15_Apna_College_Array_4 {

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

        System.out.println("\nPrint SubArrays:\n\n");
        printSubArrays(myArray);

    }

    public static void printSubArrays(int myArray[]) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(" ");
            for (int j = i; j < myArray.length; j++) {
                if (j == myArray.length - 1) {
                    System.out.print("/ ");
                } else {

                    System.out.print("| ");
                }
                for (int k = i; k <= j; k++) {
                    System.out.print(myArray[k]);
                    if (k != j) {
                        System.out.print(",");
                    }
                }
                if (j == myArray.length - 1) {
                    System.out.print(" /");
                } else {

                    System.out.print(" | ");
                }
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