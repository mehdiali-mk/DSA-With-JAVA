import java.util.Scanner;

public class _12_LargestOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number = ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("\n" + num1 + " is the greatest.");
            } else {
                System.out.println("\n" + num3 + " is the greatest.");
            }
        } else {
            if (num2 > num3) {
                System.out.println("\n" + num2 + " is the greatest.");
            } else {
                System.out.println("\n" + num3 + " is the greatest.");
            }

        }
    }
}
