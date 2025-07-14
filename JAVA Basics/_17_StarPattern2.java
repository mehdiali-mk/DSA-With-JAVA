import java.util.Scanner;

public class _17_StarPattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
