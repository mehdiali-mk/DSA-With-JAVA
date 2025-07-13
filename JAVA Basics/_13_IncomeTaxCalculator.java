import java.util.Scanner;

public class _13_IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your yearly income = ");
        double income = sc.nextDouble();

        if (income < 500000) {
            System.out.println("\nYour Income = " + income + "\nYour Income TAX = 0");
        } else if ((income > 500000) && (income < 1000000)) {
            System.out.println("\nYour Income = " + income + "\nYour Income TAX = " + (income * 0.20));
        } else {
            System.out.println("\nYour Income = " + income + "\nYour Income TAX = " + (income * 0.30));
        }
    }
}
