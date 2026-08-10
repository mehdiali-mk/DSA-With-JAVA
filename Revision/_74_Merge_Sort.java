import java.util.Arrays;

public class _74_Merge_Sort {
    public static void main(String args[]) {
        int originalArray[] = { 4, 2, 6, 5, 1, 3 };
        int mergeSortedArray[] = mergeSort(originalArray);

        System.out.println("\n\n");

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Merge Sorted Array: " + Arrays.toString(mergeSortedArray));
        System.out.println("\n\n");
    }

    public static int[] merge(int array1[], int array2[]) {
        int combineArray[] = new int[array1.length + array2.length];

        int i = 0, j = 0, index = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combineArray[index] = array1[i];
                index++;
                i++;
            } else {
                combineArray[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length) {
            combineArray[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            combineArray[index] = array2[j];
            index++;
            j++;
        }

        return combineArray;
    }

    public static int[] mergeSort(int myArray[]) {
        if (myArray.length == 1)
            return myArray;

        int midIndex = myArray.length / 2;
        int leftArray[] = mergeSort(Arrays.copyOfRange(myArray, 0, midIndex));
        int rightArray[] = mergeSort(Arrays.copyOfRange(myArray, midIndex, myArray.length));

        return merge(leftArray, rightArray);
    }
}
