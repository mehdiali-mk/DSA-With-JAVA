package Recursion;

public class _10_Power_Optimized {
    static int power(int number, int power) {
        if (power == 1) {
            return number;
        } else if (power % 2 == 0) {
            return power(number, power / 2) * power(number, power / 2);
        } else {
            return number * power(number, power / 2) * power(number, power / 2);
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\n2^3 = " + power(2, 3));
        System.out.println("5^5 = " + power(5, 5));
        System.out.println("6^2 = " + power(6, 2) + "\n\n");
    }
}
