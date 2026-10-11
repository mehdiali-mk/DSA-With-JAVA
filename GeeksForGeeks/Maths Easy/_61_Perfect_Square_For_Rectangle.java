import java.util.ArrayList;

public class _61_Perfect_Square_For_Rectangle {
    public static int findGCD(int length, int breadth) {
        while (breadth != 0) {
            int reminder = length % breadth;
            length = breadth;
            breadth = reminder;
        }

        return length;
    }

    public static ArrayList<Integer> minimumSquares(int l, int b) {
        // code here

        ArrayList<Integer> myArrayList = new ArrayList<>();

        int gcd = findGCD(l, b);

        myArrayList.add((l * b) / (gcd * gcd));
        myArrayList.add(gcd);

        return myArrayList;
    }

    public static void main(String args[]) {
        System.out.println(minimumSquares(4, 5));
    }

}
