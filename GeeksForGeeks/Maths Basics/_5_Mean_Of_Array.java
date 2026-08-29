public class _5_Mean_Of_Array {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        int mean = (sum / arr.length);

        return (int) Math.floor(mean);
    }

    public static void main(String args[]) {
        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(findMean(myArray));
    }
}
