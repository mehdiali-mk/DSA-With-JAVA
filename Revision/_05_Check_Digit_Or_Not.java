import java.util.Scanner;

public class _05_Check_Digit_Or_Not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the character = ");
        char myChar = sc.next().charAt(0);

        if (myChar > '0' && myChar < '9') {
            System.out.println("\n\nCharacter is a digit.\n\n\n");
        } else {
            System.out.println("\n\nCharacter is not a digit.\n\n\n");

        }
    }
}
