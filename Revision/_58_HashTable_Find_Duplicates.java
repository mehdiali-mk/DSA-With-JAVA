import java.util.ArrayList;
import java.util.HashMap;

public class _58_HashTable_Find_Duplicates {
    public static void main(String args[]) {
        int[] myArray = { 1, 2, 3, 2, 3, 2, 3, 4, 5, 5, };

        ArrayList<Integer> myDuplicates = findDuplicates(myArray);
        System.out.println("\nMy Duplicates = " + myDuplicates);

    }

    public static ArrayList findDuplicates(int[] array) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        ArrayList<Integer> myDuplicates = new ArrayList<>();

        for (int i : array) {
            if (myHashMap.get(i) == null)
                myHashMap.put(i, 1);
            else {
                myHashMap.put(i, myHashMap.get(i) + 1);
            }
        }

        for (int i : array) {
            if (myHashMap.get(i) > 1 && !myDuplicates.contains(i)) {
                myDuplicates.add(i);
            }
        }

        return myDuplicates;
    }
}
