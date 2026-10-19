import java.util.ArrayList;

public class _6_Alternate_Array {
    public static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) {
            myArrayList.add(arr[i]);
        }

        return myArrayList;
    }

    public static void main(String args[]) {
        System.out.println(getAlternates(new int[] { 1, 2, 3, 4, 5 }));
    }
}
