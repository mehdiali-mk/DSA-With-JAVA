import java.util.Scanner;

public class _15_PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int number = sc.nextInt();
        int i;

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("\n" + number + " is not prime number.\nAs Divisible by " + i);
                break;
            }
        }

        if (i == number) {
            System.out.println("\n" + number + " is prime number.");
        }
    }
}
