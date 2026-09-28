import java.util.ArrayList;

public class _50_Numbers_Counting_1_2_3 {
    public static ArrayList<Integer> filterByDigits(int[] arr) {
        // code here
        ArrayList<Integer> myArrayList = new ArrayList<>();
        ArrayList<Integer> allowedDigits = new ArrayList<>();

        allowedDigits.add(1);
        allowedDigits.add(2);
        allowedDigits.add(3);

        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            while (currentNumber != 0) {
                if (!allowedDigits.contains(currentNumber % 10)) {
                    break;
                } else {
                    currentNumber /= 10;
                }
            }
            if (currentNumber == 0) {
                myArrayList.add(arr[i]);
            }
        }

        if (myArrayList.isEmpty()) {
            myArrayList.add(-1);
        }

        return myArrayList;
    }

    public static void main(String args[]) {
        int array[] = new int[] { 56, 51, 7 };

        System.out.println(filterByDigits(array));
    }
}
