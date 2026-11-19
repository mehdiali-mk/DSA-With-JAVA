public class _58_Largest_Odd_In_Subsequence {

    public static int findMaxOddSum(int[] arr) {
        // code here

        int sum = 0;
        int smallestPositiveOdd = Integer.MAX_VALUE;
        int largestNegativeOdd = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > 0) {
                sum += element;
                if (element % 2 != 0 && element < smallestPositiveOdd) {
                    smallestPositiveOdd = element;
                }
            } else {
                if (element % 2 != 0 && element > largestNegativeOdd) {
                    largestNegativeOdd = element;
                }
            }
        }

        if (sum % 2 != 0) {
            return sum;
        }

        if (smallestPositiveOdd != Integer.MAX_VALUE && largestNegativeOdd != Integer.MIN_VALUE) {
            return Math.max(sum - smallestPositiveOdd, sum + largestNegativeOdd);
        }

        if (smallestPositiveOdd != Integer.MAX_VALUE) {
            return sum - smallestPositiveOdd;
        }

        if (largestNegativeOdd != Integer.MIN_VALUE) {
            return sum + largestNegativeOdd;
        }

        return -1;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 2, 5, -4, 3, -1 };

        System.out.println(findMaxOddSum(myArray));
    }
}
