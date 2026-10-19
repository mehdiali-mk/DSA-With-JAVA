public class _5_Array_Sum {
    public static int arraySum(int arr[]) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        System.out.println(arraySum(new int[] { 1, 2, 3, 4, 5 }));
    }
}