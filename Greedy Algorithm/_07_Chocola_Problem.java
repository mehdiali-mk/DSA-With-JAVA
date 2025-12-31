import java.util.Arrays;
import java.util.Collections;

public class _07_Chocola_Problem {
    public static void main(String args[]) {
        int n = 4, m = 6;
        Integer verticalCoast[] = { 2, 1, 3, 1, 4 };
        Integer horizontalCoast[] = { 4, 1, 2 };

        Arrays.sort(verticalCoast, Collections.reverseOrder());
        Arrays.sort(horizontalCoast, Collections.reverseOrder());

        int horizontalIndex = 0, verticalIndex = 0;
        int horizontalPiece = 1, verticalPiece = 1;
        int finalCoast = 0;

        while (horizontalIndex < n - 1 && verticalIndex < m - 1) {
            if (verticalCoast[verticalIndex] <= horizontalCoast[horizontalIndex]) {
                finalCoast += horizontalCoast[horizontalIndex] * verticalPiece;
                horizontalPiece++;
                horizontalIndex++;
            } else {
                finalCoast += verticalCoast[verticalIndex] * horizontalPiece;
                verticalPiece++;
                verticalIndex++;
            }
        }

        while (horizontalIndex < n - 1) {
            finalCoast += horizontalCoast[horizontalIndex] * verticalPiece;
            horizontalPiece++;
            horizontalIndex++;
        }

        while (verticalIndex < m - 1) {
            finalCoast += verticalCoast[verticalIndex] * horizontalPiece;
            verticalPiece++;
            verticalIndex++;
        }

        System.out.println("\n\n\nFinal Cost = " + finalCoast + "\n\n\n");

    }
}
