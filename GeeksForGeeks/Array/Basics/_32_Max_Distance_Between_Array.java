public class _32_Max_Distance_Between_Array {
    public static int getCount(int[] arr, int x, int y) {
        // code here
        int i = 0;

        while (i < arr.length && arr[i] != x) {
            i++;
        }

        int j = arr.length - 1;

        while (j >= 0 && arr[j] != y) {
            j--;
        }

        if (i == arr.length || j == -1 || i >= j) {
            return -1;
        }

        return j - i - 1;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 3, 2, 7 };

        System.out.println(getCount(myArray, 2, 4));
    }
}
