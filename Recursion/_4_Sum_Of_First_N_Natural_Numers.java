package Recursion;

public class _4_Sum_Of_First_N_Natural_Numers {
    static int sumOfFirstN(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumOfFirstN(number - 1);
    }

    public static void main(String args[]) {
        System.out.println("\n\nSum of 10 = " + sumOfFirstN(10));
        System.out.println("Sum of 20 = " + sumOfFirstN(20));
        System.out.println("Sum of 30 = " + sumOfFirstN(30) + "\n\n");
    }
}
