import java.util.HashMap;

public class _57_HashTable_Compare_Array_Interview_Question {
    public static void main(String args[]) {
        int[] array1 = { 1, 3, 5 };
        int[] array2 = { 2, 4, 5 };

        System.out.println("\n");
        System.out.print("Array 1 = ");
        printArray(array1);
        System.out.print("Array 2 = ");
        printArray(array2);

        System.out.println("\nisSomethingCommon = " + isSomethingCommon(array1, array2));
        System.out.println("\n");
    }

    public static void printArray(int[] array) {
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i >= array.length - 1) ? "" : " , "));
        }
        System.out.println(" ] ");
    }

    public static boolean isSomethingCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j) != null)
                return true;
        }
        return false;
    }
}
