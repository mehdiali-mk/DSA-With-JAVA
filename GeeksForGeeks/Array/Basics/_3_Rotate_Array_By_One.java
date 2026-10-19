public class _3_Rotate_Array_By_One {

    public static void rotate(int[] arr) {
        // code here

        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }

    public static void displayArray(int array[]) {
        System.out.print("Array Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + (i != array.length - 1 ? ", " : " "));

        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 3, 4, 5 };
        displayArray(myArray);
        System.out.println();
        rotate(myArray);
        displayArray(myArray);
    }

}
