public class _7_Array_All_Palindrome {

    public static boolean isPalinArray(int[] arr) {
        // code here.

        for (int i = 0; i < arr.length; i++) {
            if (!isPalindrome(arr[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int number) {
        int tempNumber = number;
        int reverseNumber = 0;
        while (tempNumber != 0) {
            reverseNumber = (reverseNumber * 10) + tempNumber % 10;
            tempNumber /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String args[]) {
        System.out.println(isPalinArray(new int[] { 121, 313, 444 }));
    }
}
