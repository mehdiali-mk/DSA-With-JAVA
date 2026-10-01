public class _53_Count_Parts_Of_Array {

    public static int totalCount(int k, int[] arr) {
        // code here
        int totalPartsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            while (currentNumber > k) {
                currentNumber -= k;
                totalPartsCount++;
            }

            totalPartsCount++;
        }

        return totalPartsCount;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 5, 8, 10, 13 };

        System.out.println(totalCount(3, myArray));
    }
}
