public class _31_FunctionOverloading {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static void main(String args[]) {
        System.out.println("\n5 * 4 = " + multiply(5, 4));

        System.out.println("2.5 * 3.5 = " + multiply(2.5f, 3.5f) + "\n");
    }
}
