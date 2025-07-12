import java.util.Scanner;

public class _06_AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius = ");
        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println("The area of circle = " + area);
    }
}
