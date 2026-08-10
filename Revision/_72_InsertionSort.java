import java.util.Arrays;

public class _72_InsertionSort {
    public static void main(String args[]) {
        int myArray[] = { 4, 1, 6, 5, 2, 3 };

        System.out.println("\n\n");
        System.out.println("Original Array = " + Arrays.toString(myArray));
        insertionSort(myArray);
        System.out.println("Insertion Sort = " + Arrays.toString(myArray));
        System.out.println("\n\n");
    }

    public static void insertionSort(int myArray[]) {
        for (int i = 1; i < myArray.length; i++) {
            int temp = myArray[i];
            int j = i - 1;

            while (j > -1 && temp < myArray[j]) {
                myArray[j + 1] = myArray[j];
                myArray[j] = temp;
                j--;
            }
        }
    }
}
