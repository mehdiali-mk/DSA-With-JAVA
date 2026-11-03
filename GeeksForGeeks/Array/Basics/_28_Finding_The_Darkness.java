public class _28_Finding_The_Darkness {

    public static int maxDays(int arr[]) {
        // code here
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int candleWithMaximumHeight = arr[0];

        for (int i = 1; i < arr.length; i++) {
            candleWithMaximumHeight = Math.max(candleWithMaximumHeight, arr[i]);
        }

        return candleWithMaximumHeight;
    }

    public static void main(String args[]) {
    }
}