import java.util.Scanner;

public class _27_ProductOfAAndB {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();

        System.out.println("\n" + num1 + " * " + num2 + " = " + multiply(num1, num2));
    }
}