public class _27_Perfect_Square_In_Range {

    public static int numOfPerfectSquares(int a, int b) {
        // code here
        if (a > b || b < 0) {
            return 0;
        }

        int start = Math.max(0, a);

        // Phase 1: Find the first integer root whose square is >= start
        int root = (int) Math.sqrt(start);
        if (root * root < start) {
            root++;
        }

        // Phase 2: Count all valid squares by incrementing the root
        int numberOfPerfectSquares = 0;
        while (root * root <= b) {
            numberOfPerfectSquares++;
            root++;
        }

        return numberOfPerfectSquares;
    }

    public static void main(String args[]) {
        System.out.println(numOfPerfectSquares(25, 49));
    }
}