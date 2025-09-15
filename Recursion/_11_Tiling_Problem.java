// * Tiling Problem
// Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles. (A tile can either be placed horizontally or vertically. )

package Recursion;

public class _11_Tiling_Problem {
    static int findTotalWays(int lengthOfBoard) {
        if (lengthOfBoard == 0 || lengthOfBoard == 1) {
            return 1;
        }
        return findTotalWays(lengthOfBoard - 1) + findTotalWays(lengthOfBoard - 2);
    }

    public static void main(String args[]) {
        System.out.println("\n\nTotal ways to tile to board:\n");
        System.out.println("Board Size 2 x 3 = " + findTotalWays(3) + " ways");
        System.out.println("Board Size 2 x 5 = " + findTotalWays(5) + " ways");
        System.out.println("Board Size 2 x 8 = " + findTotalWays(8) + " ways" + "\n\n");
    }
}
