import java.util.ArrayList;

public class _61_Element_Less_Than_K {

    public static ArrayList<Integer> elementsLessThanK(int[] arr, int k) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();

        for (int element : arr) {
            if (element < k) {
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 5, 3, 6, 1, 3 };

        System.out.println(elementsLessThanK(myArray, 4));
    }
}