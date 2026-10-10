public class _57_Squares_In_N_N_Chessboard {
    public static Long squaresInChessBoard(Long N) {
        // code here
        return (N * (N + 1) * (2 * N + 1)) / 6;
    }

    public static void main(String args[]) {
        System.out.println(squaresInChessBoard(10L));
    }
}
