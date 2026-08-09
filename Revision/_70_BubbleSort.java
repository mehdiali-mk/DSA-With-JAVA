import java.util.Arrays;

public class _70_BubbleSort {
    public static void main(String args[]) {
        int myArray[] = { 4, 2, 6, 5, 1, 3 };

        System.out.println("\n\n");
        System.out.println("Original Array = " + Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("Bubble Sort = " + Arrays.toString(myArray));
        System.out.println("\n\n");
    }

    public static void bubbleSort(int myArray[]) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
}
