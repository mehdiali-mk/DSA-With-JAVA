package Arrays;

public class _11_PrefixSumArray {
    public static void subArrays(int array[]) {
        int maximumSum = Integer.MIN_VALUE;
        int subArray[] = { 0, 0 };
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j >= i; j--) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maximumSum < sum) {
                    maximumSum = sum;
                    subArray[0] = i;
                    subArray[1] = j + 1;
                }
            }
        }

        System.out.print("\n\n(");
        for (int i = subArray[0]; i < subArray[1]; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println(") = " + maximumSum + "\n\n");
    }

    public static void main(String args[]) {
        int array[] = { 1, -2, 6, -1, 3 };

        subArrays(array);
    }
}
