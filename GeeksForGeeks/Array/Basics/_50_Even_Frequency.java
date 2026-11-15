import java.util.ArrayList;

public class _50_Even_Frequency {

    public static ArrayList<Integer> findEvenOccurrences(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int[] frequency = new int[100001];

        for (int element : arr) {
            frequency[element]++;
        }

        for (int element : arr) {
            if (frequency[element] > 0 && frequency[element] % 2 == 0) {
                result.add(element);

                frequency[element] = -1;
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15 };

        System.out.println(findEvenOccurrences(myArray));
    }
}
