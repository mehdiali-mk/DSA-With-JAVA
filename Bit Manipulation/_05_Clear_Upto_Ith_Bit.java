public class _05_Clear_Upto_Ith_Bit {
    public static int clearUptoIthBit(int number, int position) {
        return number & (-1 << position);
    }

    public static void main(String args[]) {
        int number = 15;

        System.out.println("\n\nOriginal Number = " + number);
        System.out.println("After clearing upto 2 = " + clearUptoIthBit(number, 2) + "\n\n");
    }
}
