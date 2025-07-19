import java.util.*;

public class _33_isPrimeOptimized {
    public static boolean isPrime(int number) {
        for (int i = 2; i<= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int number = sc.nextInt();

        if (isPrime(number))
        System.out.println("\n" + number + " is a prime number");
        else 
        System.out.println("\n" + number + " is not a prime number");
    }
}