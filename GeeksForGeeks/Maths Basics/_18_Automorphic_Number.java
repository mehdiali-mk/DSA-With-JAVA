public class _18_Automorphic_Number {
    public static String isAutomorphic(int n) {
        // code here
        long square = (long) n * n;

        while (n > 0) {
            if (n % 10 != square % 10) {
                return "Not Automorphic";
            }
            n /= 10;
            square /= 10;
        }

        return "Automorphic";
    }

    public static void main(String args[]) {
        System.out.println(isAutomorphic(14));
    }
}