import java.util.Scanner;

public class _32_IsPrime {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int number = sc.nextInt();

        if (isPrime(number))
            System.out.println("\n" + number + " is prime number.");
        else
            System.out.println("\n" + number + " is not a prime number");
    }
}
