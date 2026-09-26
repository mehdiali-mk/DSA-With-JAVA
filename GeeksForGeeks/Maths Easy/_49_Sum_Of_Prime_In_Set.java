import java.util.ArrayList;

public class _49_Sum_Of_Prime_In_Set {

    public static int primeSum(int n) {
        // code here
        if (n < 2) {
            return 0;
        }

        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                myArrayList.add(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            sum += myArrayList.get(i);
        }

        return sum;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(primeSum(5));
    }
}
