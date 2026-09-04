public class _17_Sum_Of_Even_And_Odd {
    public static int[] findSum(int n) {
        // Code here
        long evenCount = n / 2;
        long oddCount = (n + 1) / 2;

        long oddSum = oddCount * oddCount;
        long evenSum = evenCount * (evenCount + 1);

        return new int[] { (int) oddSum, (int) evenSum };
    }

    public static void main(String args[]) {
        System.out.println(findSum(5)[0]);
    }
}
