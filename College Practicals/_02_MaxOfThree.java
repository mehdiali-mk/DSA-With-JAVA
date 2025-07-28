// * Aim: 2. Write a Java program to find the maximum of three numbers.

import java.util.Scanner;

public class _02_MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Maximum of the three numbers is: " + max);
        scanner.close();
    }
}
