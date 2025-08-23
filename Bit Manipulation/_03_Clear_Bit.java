public class _03_Clear_Bit {
    public static int clearBit(int number, int position) {
        return (number & ~(1 << position));
    }

    public static void main(String args[]) {
        int number = 10;

        System.out.println("\n\nOriginal Number = " + number);
        System.out.println("Number after clear 1st Bit = " + clearBit(number, 1) + "\n\n");
    }
}