public class _55_Remainder_on_Division_by_11 {

    public int remainder(String s) {
        // code here
        int currentReminder = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            currentReminder = (currentReminder * 10 + digit) % 11;
        }

        return currentReminder;
    }

    public static void main(String args[]) {
    }
}