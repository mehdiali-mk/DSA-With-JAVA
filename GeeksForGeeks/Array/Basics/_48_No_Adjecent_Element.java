public class _48_No_Adjecent_Element {

    public static boolean distinctAdjacent(int[] arr) {
        // code here
        if (arr == null || arr.length <= 1) {
            return true;
        }

        int[] freq = new int[100001];
        int maxFrequency = 0;

        for (int num : arr) {
            freq[num]++;
            if (freq[num] > maxFrequency) {
                maxFrequency = freq[num];
            }
        }

        int limit = (arr.length + 1) / 2;

        return maxFrequency <= limit;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 7, 7, 7, 7 };

        System.out.println(distinctAdjacent(myArray));
    }
}
