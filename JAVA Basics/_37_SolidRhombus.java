import java.util.Scanner;

public class _37_SolidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();

        System.out.println("\n");
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = numberOfLines; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= numberOfLines; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
