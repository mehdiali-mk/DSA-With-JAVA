import java.util.Scanner;

public class _26_DiamondStarPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();
        int printCount = 1;
        int spaceCount = (numberOfLines * 2 - 1) / 2;

        System.out.println();
        for (int i = 1; i <= numberOfLines * 2 - 1; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= printCount; j++) {
                System.out.print(" * ");
            }
            if (i <= (numberOfLines * 2 - 1) / 2) {
                spaceCount--;
                printCount += 2;
            } else {
                printCount -= 2;
                spaceCount++;
            }

            System.out.println();
        }

        System.out.println("\n");
    }
}
