public class _63_Non_Zero_Digit {
    public static int rightmostNonZeroDigit(int[] arr) {
        // code here
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        while (product % 10 == 0) {
            product /= 10;
        }

        if (product == 0) {
            return -1;
        }

        return (int) product % 10;
    }

    public static void main(String args[]) {

        int myArray[] = { 3, 23, 30, 45 };

        System.out.println(rightmostNonZeroDigit(myArray));

    }
}