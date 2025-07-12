import java.util.Scanner;

public class _10_AreaOfSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square = ");
        float sideOfSquare = sc.nextFloat();

        float areaOfSquare = sideOfSquare * sideOfSquare;

        System.out.println("\nArea of Square = " + areaOfSquare);
    }
}
