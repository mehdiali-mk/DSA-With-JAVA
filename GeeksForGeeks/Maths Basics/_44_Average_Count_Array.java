import java.util.HashMap;

public class _44_Average_Count_Array {

    public static int[] countArray(int[] arr, int x) {
        // code here
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            myHashMap.put(arr[i], myHashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int average = (arr[i] + x) / 2;
            result[i] = myHashMap.getOrDefault(average, 0);
        }

        return result;
    }

    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        displayArray(countArray(new int[] { 2, 4, 8, 6, 2 }, 2));
    }
}