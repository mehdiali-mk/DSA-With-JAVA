import java.util.Scanner;

public class _25_ButterflyStarPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines * 2 - 1; j++) {
                if (j <= i || j >= (numberOfLines * 2 - 1) - i + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = numberOfLines; i >= 1; i--) {
            for (int j = 1; j <= numberOfLines * 2 - 1; j++) {
                if (j <= i || j >= (numberOfLines * 2 - i)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
