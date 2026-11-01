import java.util.ArrayList;
import java.util.List;

public class _24_Balanced_Array {

    public static int minValueToBalance(List<Integer> arr) {
        // code here

        if (arr == null || arr.size() == 0) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = 0;
        int middleIndex = arr.size() / 2;

        int i = 0;
        while (i < middleIndex) {
            leftSum += arr.get(i);
            i++;
        }
        while (i < arr.size()) {
            rightSum += arr.get(i);
            i++;
        }

        return Math.abs(leftSum - rightSum);
    }

    public static void main(String args[]) {
        List<Integer> myArray = new ArrayList<>(List.of(1, 5, 3, 2));

        System.out.println(minValueToBalance(myArray));
    }
}
