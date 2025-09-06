package Recursion;

public class _2_Increasing_Number {
    static void displayIncreasingNumber(int number) {
        if (number == 0) {
            return;
        }
        displayIncreasingNumber(number - 1);
        System.out.print(number + " ");
    }

    public static void main(String args[]) {
        System.out.println("\n\nDisplaying 1 to 10:");
        displayIncreasingNumber(10);
        System.out.println("\n\nDisplaying 1 to 15:");
        displayIncreasingNumber(15);
        System.out.println("\n\n");
    }
}
