import java.util.ArrayList;

public class _01_Print_Reverse_List {
    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            myArrayList.add(i + 1);
        }

        System.out.println("\n\nOriginal Array List:");
        System.out.println(myArrayList);

        for (int i = 0, j = myArrayList.size() - 1; i <= myArrayList.size() / 2; i++, j--) {
            int temp = myArrayList.get(i);
            myArrayList.set(i, myArrayList.get(j));
            myArrayList.set(j, temp);
        }

        System.out.println("\nReversed Array List:");
        System.out.println(myArrayList);
        System.out.println("\n\n");
    }
}
