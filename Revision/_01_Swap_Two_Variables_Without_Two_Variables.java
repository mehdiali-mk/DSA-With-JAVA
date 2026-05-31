import java.util.Scanner;

public class _01_Swap_Two_Variables_Without_Two_Variables {
    public static void main(String args[]) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\n\nEnter 1st number = ");
        num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\n1st Number = " + num1 + "\n2nd Number = " + num2 + "\n\n\n");
    }
}
