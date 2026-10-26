public class _14_Smaller_In_Sorted_With_Boundary {
    public static int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[] result = new int[2];
        int targetCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                result[0]++;
            } else if (arr[i] == target) {
                result[0]++;
                targetCount++;
            } else {
                break;
            }
        }

        result[1] = arr.length - result[0] + targetCount;

        return result;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 0, 11, 17, 22, 39, 40, 43, 49, 49, 50 };

        int result[] = getMoreAndLess(arr, 11);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
