public class _39_Sum_Of_Squares_Of_Odds {

    public static int sumofodd(int n) {
        // code here
        int sum = 0;
        for (int i = 1; i < n * 2; i += 2) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumofodd(4));
    }
}
