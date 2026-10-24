import java.util.ArrayList;
import java.util.List;

public class _11_Most_Frequent_Element {
    public static int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int xFrequency = 0;
        int yFrequency = 0;

        for (int element : arr) {
            if (element == x) {
                xFrequency++;
            } else if (element == y) {
                yFrequency++;
            }
        }

        if (xFrequency == yFrequency) {
            return Math.min(x, y);
        }
        return xFrequency > yFrequency ? x : y;
    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 4, 5));

        System.out.println(moreFrequent(arr, 4, 5));
    }
}
