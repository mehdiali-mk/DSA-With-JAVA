public class _69_Rotate_Array_Clockwise {
  public void rotateclockwise(int[] arr, int k) {
        int n = arr.length;
        
        if (n == 0) return;
        
        k = k % n; 
        
        if (k == 0) return;

        reverse(arr, 0, n - 1);
        
        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }
    
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void displayArray(int array[]) {
        System.out.print("Array = [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }

        System.out.println("]");
    }

    public static void main(String args[]) {
        int myArray[] = { 1, 2, 3, 4, 5, 6 };

        displayArray(myArray);

        rotateclockwise(myArray, 22);

        displayArray(myArray);

    }
}
