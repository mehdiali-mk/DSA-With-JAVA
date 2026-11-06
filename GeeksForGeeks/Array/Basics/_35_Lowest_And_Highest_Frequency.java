import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _35_Lowest_And_Highest_Frequency {

    public static int findDiff(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return 0;
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int currentFreq = entry.getValue();

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
            }
            if (currentFreq < minFreq) {
                minFreq = currentFreq;
            }
        }

        return maxFreq - minFreq;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 1, 2, 2 };
        System.out.println(findDiff(myArray));
    }
}
