import java.util.Scanner;

public class _06_Leap_Year_or_Not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the year = ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.print("\n\n" + year + " is leap year.\n\n\n");
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.print("\n\n" + year + " is leap year.\n\n\n");
            } else {
                System.out.print("\n\n" + year + " is not a leap year.\n\n\n");
            }
        } else {
            System.out.print("\n\n" + year + " is not a leap year.\n\n\n");
        }
    }
}
