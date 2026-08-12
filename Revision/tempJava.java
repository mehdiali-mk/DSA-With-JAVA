import java.util.Scanner;

class tempJava {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int number = sc.nextInt();

        System.out.println();
        printPrimeFactorization(number);
    }

    public static void printPrimeFactorization(int n) {
        // code here
        if (n <= 1) {
            System.out.println("No prime factors for numbers less than 2.");
            return;
        }

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
