import java.util.Scanner;

public class _23_FloydsTrianglePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();
        int floydsCounter = 1;

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(floydsCounter + " ");
                floydsCounter++;
            }
            System.out.println();
        }
    }
}
