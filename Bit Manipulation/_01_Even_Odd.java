public class _01_Even_Odd {
    public static void findEvenOdd(int number) {
        int bitMask = 1;
        if ((number & bitMask) == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        findEvenOdd(3);
        findEvenOdd(6);
        findEvenOdd(19);
        findEvenOdd(102);
        System.out.println("\n\n");
    }
}
