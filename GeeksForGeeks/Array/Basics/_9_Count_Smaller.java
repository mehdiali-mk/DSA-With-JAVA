import java.util.ArrayList;
import java.util.List;

public class _9_Count_Smaller {
    public static int countOfElements(int x, List<Integer> arr) {
        // code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>(List.of(10, 1, 2, 8, 4, 5));

        System.out.println(countOfElements(9, arr));
    }
}
