import java.util.Scanner;

public class _08_TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the floating number = ");
        float number = sc.nextFloat();
        int intNumber = (int) number;

        System.err.print("Enter a character = ");
        char character = sc.next().charAt(0);
        int intCharacter = character;

        System.out.println("Integer number = " + intNumber);
        System.out.println("Integer Character = " + intCharacter);

    }
}
