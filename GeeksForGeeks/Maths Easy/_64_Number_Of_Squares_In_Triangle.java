public class _64_Number_Of_Squares_In_Triangle {

    public static int numberOfSquares(int base) {
        // Code here

        int squaresInLastRow = (base - 2) / 2;

        if (squaresInLastRow < 0) {
            squaresInLastRow = 0;
        }

        return (squaresInLastRow * (squaresInLastRow + 1)) / 2;
    }

    public static void main(String args[]) {
        System.out.println(numberOfSquares(10));
    }
}