import java.util.Scanner;

public class _14_ReverseANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int number = sc.nextInt();

        int reverseNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println("\nReversed number = " + reverseNumber);
    }
}
