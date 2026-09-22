public class _43_Sum_Of_Product {
    public static int sumofproduct(int n) {
        // code here
        int totalSum = 0;
        for (int x = 1; x <= n; x++) {
            int y = n / x;
            totalSum += x * y;
        }

        return totalSum;
    }

    public static void main(String args[]) {
        System.out.println(sumofproduct(10));
    }
}
