public class _16_SumSquareOfEven {
    public static int sumSqEven(int n) {
        // code here
        return (2 * n * (n + 1) * (2 * n + 1)) / 3;
    }

    public static void main(String args[]) {
        System.out.println(sumSqEven(3));
    }
}