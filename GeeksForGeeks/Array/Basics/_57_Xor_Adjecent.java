public class _57_Xor_Adjecent {

    public static int countXorPair(int[] arr) {
        // code here
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return evenCount * oddCount;
    }

    public static void main(String args[]) {

        int myArray[] = new int[] { 1, 2 };

        System.out.println(countXorPair(myArray));
    }
}
