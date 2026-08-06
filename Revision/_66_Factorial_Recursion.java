import java.util.Scanner;

public class _66_Factorial_Recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.print("Enter the number = ");
        int number = sc.nextInt();5
        

        System.out.println("\nFactorial of " + number + " = " + factorial(number));

        System.out.println("\n\n");
    }

    public static int factorial(int number) {
        if (number < 0)
            number = number * -1;
        if (number == 0 || number == 1)
            return 1;
        return number * factorial(number - 1);
    }
}
