import java.util.ArrayList;
import java.util.Random;

public class _02_Max_Array_List {
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

        int maximumElement = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            maximumElement = Math.max(maximumElement, myArrayList.get(i));
        }

        System.out.println("\nMaximum Element = " + maximumElement + "\n\n");
    }
}
