import java.util.Scanner;

public class _03_Conditional_Operatos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();

        int maxNumber = num1 > num2 ? num1 : num2;
        System.out.println("\n\nMaximum number from two number = " + maxNumber + "\n\n\n");
    }
}
