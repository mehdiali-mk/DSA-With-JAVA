public class _10_Count_Of_Odd_Even {
    public static int[] countOddEven(int[] arr) {
        // Code here
        int result[] = new int[2];

        for (int element : arr) {
            if (element % 2 != 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int array[] = new int[] { 1, 2, 3, 4, 5 };

        int result[] = countOddEven(array);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
