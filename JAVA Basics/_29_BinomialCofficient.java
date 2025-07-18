import java.util.Scanner;

public class _29_BinomialCofficient {
    public static long factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long binomialCofficient(int numberOfItems, int itemNumber) {
        return (factorial(numberOfItems)) / (factorial(itemNumber) * factorial(numberOfItems - itemNumber));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the total number of items = ");
        int numberOfItems = sc.nextInt();
        System.out.print("Enter the item number = ");
        int itemNumber = sc.nextInt();

        System.out.println("\nBinomial Coefficient = " + binomialCofficient(numberOfItems, itemNumber) + "\n\n");
    }
}
