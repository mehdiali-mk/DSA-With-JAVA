import java.util.Scanner;

public class _07_Sum_Of_Integers_In_Given_Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\n\nEnter the starting range = ");
        int startRange = sc.nextInt();

        int endingRange;
        while (true) {
            System.out.print("Enter the ending range = ");
            endingRange = sc.nextInt();

            if (startRange < endingRange) {
                break;
            }
        }

        int sum = 0;

        for (int i = startRange; i <= endingRange; i++) {
            sum += i;
        }

        System.out.println("\n\nSum between " + startRange + " and " + endingRange + " = " + sum);
    }
}
