public class _04_Update_Bit {
    public static int updateIthBit(int number, int i, int updateValue) {
        return (number & ~(1 << i)) | (updateValue << i);
    }

    public static void main(String args[]) {
        int number = 10;

        System.out.println("\n\nOriginal Number = " + number);
        System.out.println("After updating 1st Bit = " + updateIthBit(number, 2, 1) + "\n\n");
    }
}
