public class _11_Add_One {
    public static int addOneToNumber(int number) {
        return -(~number);
    }

    public static void main(String args[]) {
        System.out.println("\n\nAdd 1 to 7 = " + addOneToNumber(7));
        System.out.println("Add 1 to 12 = " + addOneToNumber(12));
        System.out.println("Add 1 to 99 = " + addOneToNumber(99) + "\n\n");
    }
}
