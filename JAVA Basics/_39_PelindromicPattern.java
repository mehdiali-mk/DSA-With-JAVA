import java.util.Scanner;

public class _39_PelindromicPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}