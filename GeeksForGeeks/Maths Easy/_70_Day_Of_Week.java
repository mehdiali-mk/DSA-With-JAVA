public class _70_Day_Of_Week {

    public static String getDayOfWeek(int[] date) {
        // code here

        int day = date[0];
        int month = date[1];
        int year = date[2];

        // adjust for Jan and Feb.
        if (month < 3) {
            month += 12;
            year--;
        }

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        // Mathematical formula.
        int index = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String myString[] = {
                "Saturday", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday"
        };

        return myString[index];
    }

    public static void main(String args[]) {
        System.out.println(getDayOfWeek(new int[] { 28, 12, 1995 }));
    }
}