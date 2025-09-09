package Recursion;

public class _5_Nth_Fibonacci_Number {
    static int nThFibonacciNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return nThFibonacciNumber(number - 1) + nThFibonacciNumber(number - 2);
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\n3rd Fibonacci Number = " + nThFibonacciNumber(3));
        System.out.println("5th Fibonacci Number = " + nThFibonacciNumber(5));
        System.out.println("15th Fibonacci Number = " + nThFibonacciNumber(15) + "\n\n");
    }
}
