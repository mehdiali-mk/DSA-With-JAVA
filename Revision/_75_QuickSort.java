import java.util.Arrays;

public class _75_QuickSort {
    public static void main(String args[]) {
        int myArray[] = { 4, 6, 1, 7, 3, 2, 5 };

        System.out.println("\n\n");
        System.out.println("Original Array: " + Arrays.toString(myArray));
        quickSort(myArray);
        System.out.println("\nQuick Sort: " + Arrays.toString(myArray));
        System.out.println("\n\n");

    }

    public static void quickSort(int myArray[]) {
        rQuickSort(myArray, 0, myArray.length);
    }

    public static void rQuickSort(int myArray[], int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivotIndex = pivot(myArray, leftIndex, rightIndex);
            rQuickSort(myArray, leftIndex, pivotIndex - 1);
            rQuickSort(myArray, pivotIndex + 1, rightIndex);
        }
    }

    public static int pivot(int myArray[], int pivotIndex, int endIndex) {
        int swap = pivotIndex;
        for (int i = pivotIndex + 1; i < endIndex; i++) {
            if (myArray[i] < myArray[pivotIndex]) {
                swap++;
                swap(myArray, i, swap);
            }
        }

        swap(myArray, pivotIndex, swap);
        return swap;
    }

    public static void swap(int myArray[], int firstIndex, int secondIndex) {
        int temp = myArray[firstIndex];
        myArray[firstIndex] = myArray[secondIndex];
        myArray[secondIndex] = temp;
    }
}
