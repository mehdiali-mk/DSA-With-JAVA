public class _58_Nth_Fibonacci_Last_Digit {
    public static int fib(int n) {
        // code here
        if (n <= 1) {
            return n;
        }

        int previousFibonacci = 1;
        int currentFibonacci = 1;
        for (int i = 2; i < n; i++) {
            int temp = currentFibonacci;
            currentFibonacci = (currentFibonacci + previousFibonacci) % 10;
            previousFibonacci = temp;
        }

        return currentFibonacci;
    }

    public static void main(String args[]) {
        System.out.println(fib(100000));
    }
}
