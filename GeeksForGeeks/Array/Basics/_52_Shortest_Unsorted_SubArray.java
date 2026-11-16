public class _52_Shortest_Unsorted_SubArray {

    public static int shortestUnorderedSubarray(int arr[]) {
        // Code Here
        if (arr == null || arr.length < 3) {
            return 0;
        }

        int previous = arr[0];
        int current = arr[1];

        for (int i = 2; i < arr.length; i++) {
            int next = arr[i];

            if (previous < current && current > next) {
                return 3;
            } else if (previous > current && current < next) {
                return 3;
            }

            previous = current;
            current = next;
        }

        return 0;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 7, 9, 10, 8, 11 };

        System.out.println(shortestUnorderedSubarray(myArray));
    }
}
