import java.util.ArrayList;
import java.util.HashMap;

public class _65_Uneaten_Leaves {
    public static int uneatenLeaves(int[] arr, int m) {
        // code here
        boolean[] eaten = new boolean[m + 1];

        boolean[] processedJumps = new boolean[m + 1];

        for (int i = 0; i < arr.length; i++) {
            int jump = arr[i];

            if (jump > m) {
                eaten[1] = true;
                continue;
            }

            if (!processedJumps[jump]) {
                processedJumps[jump] = true;

                for (int j = 1; j <= m; j += jump) {
                    eaten[j] = true;
                }
            }
        }

        int uneatenLeavesCount = 0;
        for (int i = 1; i <= m; i++) {
            if (!eaten[i]) {
                uneatenLeavesCount++;
            }
        }

        return uneatenLeavesCount;
    }

    public static void main(String args[]) {
        int array[] = { 2, 3, 5 };

        System.out.println(uneatenLeaves(array, 10));
    }
}
