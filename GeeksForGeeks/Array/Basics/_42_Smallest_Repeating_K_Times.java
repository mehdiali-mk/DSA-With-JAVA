import java.util.HashMap;
import java.util.Map;

public class _42_Smallest_Repeating_K_Times {

    public static int findDuplicate(int[] arr, int k) {
        // code here

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int smallestK = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == k) {
                if (entry.getKey() < smallestK) {
                    smallestK = entry.getKey();
                }
            }
        }

        return smallestK == Integer.MAX_VALUE ? -1 : smallestK;
    }

    public static void main(String args[]) {
        int myArray1[] = new int[] { 2, 2, 1, 3, 1 };

        System.out.println(findDuplicate(myArray1, 2));
    }
}
