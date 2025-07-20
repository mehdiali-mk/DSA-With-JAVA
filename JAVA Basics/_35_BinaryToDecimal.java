import java.util.Scanner;

public class _35_BinaryToDecimal {
    public static int BinaryToDecimal(long number) {
        int decimalNumber = 0, power = 0;
        while (number > 0) {
            int lastDigit = (int) (number % 10);
            decimalNumber += (int) (lastDigit * Math.pow(2, power));

            number /= 10;
            power++;
        }
        return decimalNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a binary number = ");
        long binaryNumber = sc.nextLong();

        System.out.println("Decimal Number of " + binaryNumber + " = " + BinaryToDecimal(binaryNumber) + "\n\n");
    }
}
