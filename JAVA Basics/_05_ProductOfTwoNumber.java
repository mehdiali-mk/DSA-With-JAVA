import java.util.Scanner;

public class _05_ProductOfTwoNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();

        System.out.println("\n\n" + num1 + " * " + num2 + " = " + (num1 * num2));
    }
}
