public class _30_FunctionOverloading {
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    public static float sum(float num1, float num2, float num3) {
        return num1 + num2 + num3;
    }

    public static void main(String args[]) {
        System.out.println("\n5 + 3 = " + sum(5, 3));
        System.out.println("5 + 2 + 2 = " + sum(5, 2, 2) + "\n");
    }
}
