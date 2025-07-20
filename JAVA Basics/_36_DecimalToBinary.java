import java.util.Scanner;

public class _36_DecimalToBinary {
    public static long decimalToBinary(int number) {
        int binaryNumber = 0, power = 0;
        while (number > 0) {
            int reminder = number % 2;

            binaryNumber += (reminder * Math.pow(10, power));

            power++;
            number /= 2;
        }
        return binaryNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a decimal number = ");
        int decimalNumber = sc.nextInt();

        System.out.println("Binary number of " + decimalNumber + " = " + decimalToBinary(decimalNumber) + "\n\n");
    }
}
