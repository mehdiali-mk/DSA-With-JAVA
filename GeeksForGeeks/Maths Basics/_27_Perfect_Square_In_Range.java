public class _27_Perfect_Square_In_Range {

    public static int numOfPerfectSquares(int a, int b) {
        // code here
        int currentNumber = a;
        double squareRootOfCurrentNumber = Math.sqrt(currentNumber);

        while (currentNumber <= b && squareRootOfCurrentNumber % 1 != 0) {
            currentNumber++;
            squareRootOfCurrentNumber = Math.sqrt(currentNumber);
        }

        int numberOfPerfectSquares = 0;

        while (currentNumber <= b) {

            currentNumber = (int) Math.pow((++squareRootOfCurrentNumber), 2);

            numberOfPerfectSquares++;
        }

        return numberOfPerfectSquares;
    }

    public static void main(String args[]) {
        System.out.println(numOfPerfectSquares(25, 49));
    }
}