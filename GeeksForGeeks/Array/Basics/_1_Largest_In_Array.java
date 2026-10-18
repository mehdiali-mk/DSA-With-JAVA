public class _1_Largest_In_Array {
    public static int largest(int[] arr) {
        // code here
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return arr[max];
    }

    public static void main(String args[]) {
        System.out.println(largest(new int[] { 2, 3, 4, 90, 5, 20 }));
    }
}
