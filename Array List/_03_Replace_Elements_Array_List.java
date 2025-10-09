import java.util.ArrayList;
import java.util.Random;

public class _03_Replace_Elements_Array_List {

    public static void replace(ArrayList<Integer> myArrayList, int firstIndex, int secondIndex) {
        int temp = myArrayList.get(firstIndex);
        myArrayList.set(firstIndex, myArrayList.get(secondIndex));
        myArrayList.set(secondIndex, temp);
    }

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

        replace(myArrayList, 1, 3);

        System.out.println("\nAfter Replacing Array List:");
        System.out.println(myArrayList + "\n\n");
    }
}
