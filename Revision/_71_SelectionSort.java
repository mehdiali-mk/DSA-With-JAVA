import java.util.Arrays;

public class _71_SelectionSort {
    public static void main(String args[]) {
        int myArray[] = { 4, 1, 6, 5, 2, 3 };

        System.out.println("\n\n");
        System.out.println("Original Array = " + Arrays.toString(myArray));
        selectionSort(myArray);
        System.out.println("Selection Sort = " + Arrays.toString(myArray));
        System.out.println("\n\n");
    }

    public static void selectionSort(int myArray[]) {

        for (int i = 0; i < myArray.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            if (i != minimumIndex) {
                int temp = myArray[i];
                myArray[i] = myArray[minimumIndex];
                myArray[minimumIndex] = temp;
            }
        }
    }
}