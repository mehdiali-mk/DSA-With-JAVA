import java.util.ArrayList;

public class _22_Strongest_Neighbour {
    public static ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        if (arr == null || arr.length < 2) {
            return new ArrayList<>();
        }
        ArrayList<Integer> myArrayList = new ArrayList<>(arr.length - 1);

        for (int i = 0; i < arr.length - 1; i++) {
            myArrayList.add(Math.max(arr[i], arr[i + 1]));
        }

        return myArrayList;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 2, 3, 4, 5 };

        System.out.println(maxAdj(myArray));
    }
}
