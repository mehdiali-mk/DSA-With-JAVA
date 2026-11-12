import java.util.ArrayList;
import java.util.List;

public class _44_Triplate_Sum_Largest {

    public static int maxTripletSum(List<Integer> arr) {
        // Code Here

        if (arr == null || arr.size() < 3) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);

            if (num >= largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num >= secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest) {
                thirdLargest = num;
            }
        }

        return largest + secondLargest + thirdLargest;
    }

    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>(List.of(1, 0, 8, 6, 4, 2));

        System.out.println(maxTripletSum(myList));
    }
}