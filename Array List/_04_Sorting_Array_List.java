import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class _04_Sorting_Array_List {
    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Random random = new Random();
        int min = 10;
        int max = 50;

        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            myArrayList.add(randomNumber);
        }

        System.out.println("\n\nOriginal Array List:");
        System.out.println(myArrayList);

        Collections.sort(myArrayList);
        System.out.println("\nAscending Order Sort:");
        System.out.println(myArrayList);

        Collections.sort(myArrayList, Collections.reverseOrder());
        System.out.println("\nDescending Order Sort:");
        System.out.println(myArrayList);
        System.out.println("\n\n");
    }
}
