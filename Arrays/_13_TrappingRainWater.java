/*
 * Trapping Rainwater
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * height [4, 2, O, 6, 3, 2, 5]
 * 
 * 
 * 
 * Refer the following Link
 ? https://leetcode.com/problems/trapping-rain-water/description/
 */

package Arrays;

public class _13_TrappingRainWater {
    public static int trappingRainWater(int heights[]) {
        int leftMaximumHeights[] = new int[heights.length];
        int rightMaximumHeights[] = new int[heights.length];

        // Find Left Maximum Bar.
        leftMaximumHeights[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMaximumHeights[i] = Math.max(heights[i], leftMaximumHeights[i - 1]);
        }

        // Find Right Maximum Bar.
        rightMaximumHeights[heights.length - 1] = heights[heights.length - 1];
        for (int i = heights.length - 2; i >= 0; i--) {
            rightMaximumHeights[i] = Math.max(heights[i], rightMaximumHeights[i + 1]);
        }

        // Calculating Trapped Water.
        int trappedWater = 0;
        for (int i = 0; i < heights.length; i++) {
            // Find Water Level.
            int waterLevel = Math.min(leftMaximumHeights[i], rightMaximumHeights[i]);
            // Find Trapped Water.
            trappedWater += waterLevel - heights[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };

        int trappedWater = trappingRainWater(heights);
        System.out.println("\n\nTrapped Rainwater = " + trappedWater + "\n\n");
    }
}
