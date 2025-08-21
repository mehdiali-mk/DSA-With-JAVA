public class _02_Get_Ith_Bit {
    public static int getIthBit(int number, int position) {
        int bitMask = number << position;

        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int number, int position) {
        return number | (1 << position);
    }

    public static void main(String args[]) {
        System.out.println("\n\nGET 2nd bit in 10 = " + getIthBit(10, 2));
        System.out.println("GET 3rd bit in 10 = " + getIthBit(10, 3) + "\n");
        System.out.println("SET 2nd bit in 10 = " + setIthBit(10, 2) + "\n\n");
    }
}
