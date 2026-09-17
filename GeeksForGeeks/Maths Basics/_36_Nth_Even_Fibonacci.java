public class _36_Nth_Even_Fibonacci {
    public static int nthEvenFibonacci(int n) {
        // code here

        int previous = 1;
        int current = 2;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                int temp = previous;
                previous = current;
                current = temp + current;
            }
        }

        return current;
    }

    public static void main(String args[]) {
        System.out.println(nthEvenFibonacci(50));
    }
}
