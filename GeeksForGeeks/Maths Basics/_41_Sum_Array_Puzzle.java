public class _41_Sum_Array_Puzzle {

    public static void sumArray(int[] arr) {
        // code here
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = totalSum - arr[i];
        }
    }

    public static void main(String args[]) {

    }
}