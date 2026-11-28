public class _3_Move_All_Zeros {
    public static void pushZerosToEnd(int[] arr) {
        // code here
        if (arr == null || arr.length <= 1) {
            return;
        }

        int insertPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }

    public static void displayArray(int array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 0, 4, 3, 0, 5, 0 };

        displayArray(myArray);
        pushZerosToEnd(myArray);
        displayArray(myArray);
    }
}
