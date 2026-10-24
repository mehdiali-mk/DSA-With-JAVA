public class _12_Sum_Except {
    public static int sumExceptFirstLast(int[] arr) {
        // code here
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(sumExceptFirstLast(arr));
    }
}
