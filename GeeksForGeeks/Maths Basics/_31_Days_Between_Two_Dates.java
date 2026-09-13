public class _31_Days_Between_Two_Dates {

    static int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private static int countLeapYears(int year) {
        return (year / 4) - (year / 100) + (year / 400);
    }

    private static int countTotalDays(int d, int m, int y) {
        int totalDays = (y - 1) * 365 + countLeapYears(y - 1);

        for (int i = 1; i < m; i++) {
            totalDays += monthDays[i];
        }

        if (m > 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))) {
            totalDays++;
        }

        totalDays += d;

        return totalDays;
    }

    public static int numOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        int days1 = countTotalDays(d1, m1, y1);
        int days2 = countTotalDays(d2, m2, y2);

        return Math.abs(days2 - days1);
    }

    public static void main(String args[]) {
        System.out.println(numOfDays(10, 1, 2013, 14, 9, 2020));
        ;
        System.out.println(numOfDays(14, 9, 2020, 10, 1, 2013));
        ;
    }
}