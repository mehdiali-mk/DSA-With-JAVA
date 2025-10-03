package Backtracking;

public class _05_Grid_Ways {
    public static int gridWays(int currentRow, int currentColumn, int totalRow, int totalColumn) {
        if (currentRow == totalRow - 1 && currentColumn == totalColumn - 1) {
            return 1;
        } else if (currentRow == totalRow || currentColumn == totalColumn) {
            return 0;
        }

        return gridWays(currentRow + 1, currentColumn, totalRow, totalColumn)
                + gridWays(currentRow, currentColumn + 1, totalRow, totalColumn);
    }

    public static void main(String args[]) {
        System.out.println("\n\nGrid Ways of 3 X 3 = " + gridWays(0, 0, 3, 3));
        System.out.println("Grid Ways of 4 X 4 = " + gridWays(0, 0, 4, 4));
        System.out.println("\n\n");
    }
}
