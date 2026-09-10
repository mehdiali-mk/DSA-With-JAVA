import java.util.ArrayList;
import java.util.Arrays;

public class _24_Square_Of_Primes {

    public static int[] primePairs(int n) {
        // Code here

        if (n < 4)
            return new int[0];

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> allPrimes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                allPrimes.add(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < allPrimes.size(); i++) {
            for (int j = 0; j < allPrimes.size(); j++) {
                int p = allPrimes.get(i);
                int q = allPrimes.get(j);

                if (p * q <= n) {
                    result.add(p);
                    result.add(q);
                } else {
                    break;
                }
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }

    public static void main(String args[]) {
        System.out.println(primePairs(10));
    }
}