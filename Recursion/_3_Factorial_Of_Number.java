package Recursion;

public class _3_Factorial_Of_Number {
    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return factorial(number - 1) * number;
    }

    public static void main(String args[]) {
        System.out.println("\n\nFactorial of 5 = " + factorial(5));
        System.out.println("Factorial of 8 = " + factorial(8));
        System.out.println("Factorial of 10 = " + factorial(10) + "\n\n");
    }
}
