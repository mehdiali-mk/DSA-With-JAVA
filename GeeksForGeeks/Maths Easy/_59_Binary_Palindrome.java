
public class _59_Binary_Palindrome {
    public static boolean isBinaryPalindrome(int n) {
        // code here
        StringBuilder sb = new StringBuilder();

        while (n >= 1) {
            sb.append(n % 2);
            n /= 2;
        }

        String currentString = sb.toString();
        String reversedString = sb.reverse().toString();

        System.out.println(currentString);
        System.out.println(reversedString);

        if (currentString.compareTo(reversedString) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(isBinaryPalindrome(4));
    }
}