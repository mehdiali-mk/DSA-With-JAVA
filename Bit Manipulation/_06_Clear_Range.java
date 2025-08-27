public class _06_Clear_Range {
    public static int clearRange(int number, int i, int j) {
        return number & (-1 << j + 1) | (int) Math.pow(2, i) - 1;
    }

    public static void main(String args[]) {
        int number = 10;

        System.out.println("\n\nOriginal Number = " + number);
        System.out.println("After clearing upto 2 = " + clearRange(number, 0, 2) + "\n\n");
    }
}
