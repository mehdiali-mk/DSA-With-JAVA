public class _17_RainWater_Trapping_Max {
    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5, 0, 6 };

        int trappedWater = findMaxTrappedWater(height);

        System.out.print("\n\nHeights of Bars: ");
        printArray(height);
        System.out.println("\nMaximum trapped water between bars = " + trappedWater + "\n\n\n");
    }

    public static int findMaxTrappedWater(int height[]) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int trappedWater = 0;
        int maxTrappedWater = Integer.MIN_VALUE;

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > leftMax[i - 1]) {
                leftMax[i] = height[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }

        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {

            if (height[i] > rightMax[i + 1]) {
                rightMax[i] = height[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        for (int i = 0; i < height.length; i++) {
            int currentTrappedWater = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (currentTrappedWater == 0) {
                maxTrappedWater = Math.max(maxTrappedWater, trappedWater);
                trappedWater = 0;
            } else {
                trappedWater += currentTrappedWater;
            }
        }

        return maxTrappedWater;
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}
