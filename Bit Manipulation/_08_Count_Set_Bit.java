public class _08_Count_Set_Bit {
    public static int countSetBit(int number) {
        int count = 0;
        while (number != 0) {
            if ((number & (1 << 0)) == 1) {
                count++;
            }
            number = number >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        int number = 5;

        System.out.println("\n\nSet bits in " + number + " are = " + countSetBit(number));
        number = 11;
        System.out.println("Set bits in " + number + " are = " + countSetBit(number));
        number = 15;
        System.out.println("Set bits in " + number + " are = " + countSetBit(number) + "\n\n");
    }
}
