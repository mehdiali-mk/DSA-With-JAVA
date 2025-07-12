import java.util.*;

public class _03_Inputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name = ");
        String firstName = sc.nextLine();
        System.out.print("Enter your full name = ");
        String fullName = sc.nextLine();
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        System.out.print("Enter your CGPA = ");
        float cgpa = sc.nextFloat();

        System.out.println("\n" + "Your first name = " + firstName);
        System.out.println("Your Full Name = " + fullName);
        System.out.println("Your age = " + age);
        System.out.print("Your CGPA = " + cgpa);
    }
}