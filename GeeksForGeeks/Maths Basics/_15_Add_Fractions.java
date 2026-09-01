import java.util.ArrayList;

public class _15_Add_Fractions {

    public static int findGCD(int a, int b) {

        if (b == 0) {
            return Math.abs(a);
        }

        return findGCD(b, a % b);
    }

    public static ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {
        // code here
        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = den1 * den2;

        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));

        ArrayList<Integer> result = new ArrayList<>();
        result.add(numerator / gcd);
        result.add(denominator / gcd);

        return result;
    }

    public static void main(String args[]) {
        System.out.println(addFraction(1, 6, 1, 3));
    }
}
