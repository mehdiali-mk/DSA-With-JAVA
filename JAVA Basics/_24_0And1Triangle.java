import java.util.Scanner;

public class _24_0And1Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number = ");
        int numberOfLines = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {

                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
