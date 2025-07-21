import java.util.Scanner;

public class _34_isPrimeInRange {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void primeInRange(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int number = sc.nextInt();

        System.out.println("\nPrime numbers in range (2, " + number + "): ");
        primeInRange(number);
        System.out.println("\n\n");
    }
}
