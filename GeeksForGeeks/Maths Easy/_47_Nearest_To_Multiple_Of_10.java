public class _47_Nearest_To_Multiple_Of_10 {
    public static String roundToNearest(String s) {
        // Code Here
        int n = s.length();
        int lastDigit = s.charAt(n - 1) - '0';

        if (lastDigit == 0) {
            return s;
        }

        char[] arr = s.toCharArray();
        arr[n - 1] = '0';

        if (lastDigit <= 5) {
            return new String(arr);
        }

        int i = n - 2;
        while (i >= 0 && arr[i] == '9') {
            arr[i] = '0';
            i--;
        }

        if (i < 0) {
            return "1" + new String(arr);
        } else {
            arr[i]++;
            return new String(arr);
        }
    }

    public static void main(String args[]) {
        System.out.println(roundToNearest("39918170518645084488358420102776921"));
    }
}
