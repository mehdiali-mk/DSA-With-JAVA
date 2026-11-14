import java.util.Arrays;

public class _49_MAX_Perimeter_Triangle {

    public static int maxPerimeter(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return -1;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 2; i--) {
            int maxSide = arr[i];
            int otherTwoSideSum = arr[i - 1] + arr[i - 2];

            if (otherTwoSideSum > maxSide) {
                return maxSide + otherTwoSideSum;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 7, 55, 20, 1, 4, 33, 12 };

        System.out.println(maxPerimeter(myArray));
    }
}
