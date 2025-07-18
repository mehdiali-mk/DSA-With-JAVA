import java.util.Scanner;

public class _28_Factorial {
    public static long factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int number = sc.nextInt();

        System.out.println("\nThe factorial of " + number + " is = " + factorial(number) + "\n\n");
    }
}
