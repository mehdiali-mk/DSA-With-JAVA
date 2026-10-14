import java.util.ArrayList;

public class _62_Minimum_Steps_For_Product_1 {

    public static int makeProductOne(ArrayList<Integer> arr) {
        // code here
        int totalSteps = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int currentNumber = arr.get(i);

            if (currentNumber != 0) {
                totalSteps += (Math.abs(currentNumber) - 1);

                if (currentNumber < 0) {
                    negativeCount++;
                }
            } else {

                totalSteps += 1;
                zeroCount++;
            }
        }

        if (negativeCount % 2 != 0 && zeroCount == 0) {
            totalSteps += 2;
        }

        return totalSteps;

    }

    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(-2);
        myArrayList.add(0);
        myArrayList.add(4);
        System.out.println(makeProductOne(myArrayList));
    }
}
