package Recursion;

public class _1_Decreasing_Number {

    static void displayDecreasingNumber(int number) {
        if (number == 1) {
            System.out.println(number);
            return;
        }
        System.out.print(number + " ");
        displayDecreasingNumber(number - 1);
    }

    public static void main(String args[]) {
        System.out.println("\n\nDisplaying Decreasing Number from 10 to 1:");
        displayDecreasingNumber(10);
        System.out.println("\nDisplaying Decreasing Number from 15 to 1:");
        displayDecreasingNumber(15);
        System.out.println("\n\n");
    }

}
