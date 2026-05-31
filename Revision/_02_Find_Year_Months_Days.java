import java.util.Scanner;

public class _02_Find_Year_Months_Days {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\n\nEnter number of days = ");
        int totalDays = sc.nextInt();

        int years = (totalDays / 365);
        int months = ((totalDays % 365) / 30);
        int days = ((totalDays % 365) % 30);

        System.out.println("\n\nThere are " + years + " years and " + months + " months and " + days + " days.\n\n");
    }
}
