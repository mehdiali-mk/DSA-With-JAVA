import java.util.ArrayList;

public class _20_Exor_Of_Elements {
    public static ArrayList<Integer> xorArray(int[] arr) {
        // code here
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            myArrayList.add(arr[i] ^ arr[i + 1]);
        }
        myArrayList.add(arr[arr.length - 1]);
        return myArrayList;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 10, 11, 1, 2, 3 };

        System.out.println(xorArray(myArray));
    }
}
