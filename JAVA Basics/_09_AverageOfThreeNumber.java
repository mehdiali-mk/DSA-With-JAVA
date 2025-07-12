import java.util.Scanner;

public class _09_AverageOfThreeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number = ");
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3) / 3;

        System.out.println("\nAverage = " + average);

    }
}
