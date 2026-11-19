import java.util.ArrayList;

public class _59_Sum_Triangle {

    public static ArrayList<Integer> getTriangle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (i == 0) {
                    result.add(arr[j]);
                } else {
                    result.add(j, result.get(j + j) + result.get(j + j + 1));
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 4, 7, 3, 6, 7 };

        System.out.println(getTriangle(myArray));
    }
}