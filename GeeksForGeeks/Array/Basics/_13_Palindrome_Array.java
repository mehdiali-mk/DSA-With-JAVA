public class _13_Palindrome_Array {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 2, 1 };

        System.out.println(isPalindrome(arr));
    }
}
