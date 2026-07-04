public class _16_RainWater_Trapping {
    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        int trappedWater = findTrappedWater(height);

        System.out.print("\n\nHeights of Bars: ");
        printArray(height);
        System.out.println("\nTotal trapped water between bars = " + trappedWater + "\n\n\n");
    }

    public static int findTrappedWater(int height[]) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int totalTrappedWater = 0;

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
            totalTrappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalTrappedWater;
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}
