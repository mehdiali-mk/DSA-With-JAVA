public class _53_Count_Prefix_Maximus {
    public static int countElements(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 1;
        int currentLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentLargest) {
                count++;
                currentLargest = arr[i];
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 10, 40, 23, 35, 50, 7 };

        System.out.println(countElements(myArray));
    }
}