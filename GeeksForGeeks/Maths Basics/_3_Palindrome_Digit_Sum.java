public class _3_Palindrome_Digit_Sum {
    public static boolean isDigitSumPalindrome(int n) {
        // code here
        int tempNum = n;
        int sum = 0;
        while (tempNum > 0) {
            sum += tempNum % 10;
            tempNum = tempNum / 10;
        }

        tempNum = sum;
        int reversedNumber = 0;
        while (tempNum > 0) {
            int remainder = tempNum % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            tempNum = tempNum / 10;
        }
        if (sum == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(isDigitSumPalindrome(98));
    }
}
