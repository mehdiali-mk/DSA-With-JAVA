public class _26_Lazy_Caterers_Problem {

    public static int maxCuts(int n) {
        // code here

        int numberOfPie = 1;
        for (int i = 1; i <= n; i++) {
            numberOfPie += i;
        }

        return numberOfPie;
    }

    public static void main(String args[]) {
        System.out.println(maxCuts(6));
    }
}