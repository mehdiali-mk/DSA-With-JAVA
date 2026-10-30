public class _21_Multiply_And_Add {
    public static int multiply(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = 0;
        int middleIndex = arr.length / 2;

        int i = 0;
        while (i < middleIndex) {
            leftSum += arr[i];
            i++;
        }
        while (i < arr.length) {
            rightSum += arr[i];
            i++;
        }

        return leftSum * rightSum;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 64, 73, 42, 53, 79, 91, 5, 46, 85 };

        System.out.println(multiply(myArray));
    }
}
