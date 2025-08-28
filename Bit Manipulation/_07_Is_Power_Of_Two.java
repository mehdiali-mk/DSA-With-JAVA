public class _07_Is_Power_Of_Two {
    public static boolean IsPowerOfTwo(int number) {
        return (number & (number - 1)) == 0;
    }

    public static void main(String args[]) {
        int number = 16;

        System.out.println("\n\nIs " + number + " power of two = " + IsPowerOfTwo(number));
        number = 7;
        System.out.println("Is " + number + " power of two = " + IsPowerOfTwo(number));
        number = 8;
        System.out.println("Is " + number + " power of two = " + IsPowerOfTwo(number) + "\n\n");
    }
}