public class _66_Minimum_Time_Required {

    public static int minTime(int n, int s1, int s2) {
        // code here
        long low = 1;

        long high = (long) n * Math.min(s1, s2);
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long docs = (mid / s1) + (mid / s2);

            if (docs >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;

    }

    public static void main(String args[]) {
        System.out.println(minTime(10, 2, 4));
    }
}
