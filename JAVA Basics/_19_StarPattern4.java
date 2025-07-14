import java.util.Scanner;

public class _19_StarPattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();
        char alphabet = 'A';

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
