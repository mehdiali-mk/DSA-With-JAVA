import java.util.ArrayList;

public class _05_MultiDimensional_Array_List {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> allTables = new ArrayList<>();
        ArrayList<Integer> oneTable = new ArrayList<>();
        ArrayList<Integer> twoTable = new ArrayList<>();
        ArrayList<Integer> threeTable = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            oneTable.add(i * 1);
            twoTable.add(i * 2);
            threeTable.add(i * 3);
        }

        allTables.add(oneTable);
        allTables.add(twoTable);
        allTables.add(threeTable);

        System.out.println("\n\nMulti-Dimensional ArrayList:\n");
        for (int i = 0; i < allTables.size(); i++) {
            ArrayList<Integer> tempArrayList = allTables.get(i);
            for (int j = 0; j < tempArrayList.size(); j++) {
                System.out.print(tempArrayList.get(j) + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
