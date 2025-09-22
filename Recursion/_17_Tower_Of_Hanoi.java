package Recursion;

public class _17_Tower_Of_Hanoi {
    static void towerOfHanoi(int number, String source, String helper, String destination) {
        if (number == 1) {
            System.out.println("Transfer disk " + number + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(number - 1, source, destination, helper);
        System.out.println("Transfer disk " + number + " from " + source + " to " + helper);
        towerOfHanoi(number - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        System.out.println("\nTower of Hanoi of 4 plates:\n");
        towerOfHanoi(4, "A", "B", "C");
        System.out.println("\n\n");
    }
}
