import java.util.Scanner;

public class _04_Absolute_Value {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the number = ");
        int number = sc.nextInt();

        System.out.println("\nReal number = " + number);
        number = makeAbsolute(number);
        System.out.println("Absolute number = " + number + "\n\n");

    }

    public static int makeAbsolute(int number) {
        if (number < 0) {
            return number * -1;
        }

        return number;
    }
}
