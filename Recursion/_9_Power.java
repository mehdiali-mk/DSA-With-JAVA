package Recursion;

public class _9_Power {
    static int power(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * power(number, power - 1);
    }

    public static void main(String args[]) {
        System.out.println("\n\n2^3 = " + power(2, 3));
        System.out.println("5^5 = " + power(5, 5));
        System.out.println("6^2 = " + power(6, 2) + "\n\n");
    }
}
