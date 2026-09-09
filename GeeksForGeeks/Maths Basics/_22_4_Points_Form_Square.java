/*
Check if Four Points Form a Square
Difficulty: BasicAccuracy: 35.49%Submissions: 20K+Points: 1
Given an 2D array points[] which represents coordinates of four points in a plane. Find if the four points can form a square or not. Return true if they form a square else return false.

Examples :

Input: points[] = [[0, 0], [0, 1], [1, 0], [1, 1]]
Output: true
Explanation: These points form a square which can be clearly seen in the below image.

Input: points[] = [[0, 0], [1, 1], [1, 0], [0, 2]]
Output: false
Explanation: These four points do not form a square.

Constraints:
0 ≤ X-coordinate, Y-coordinate ≤ 105

*/

import java.util.Arrays;

public class _22_4_Points_Form_Square {

    public static boolean isSquare(int points[][]) {
        int minTerm[] = new int[2];
        int maxTerm[] = new int[2];
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            int currentSum = 0;
            for (int j = 0; j < 2; j++) {
                currentSum += points[i][j];
            }

            if (currentSum < minSum) {
                minTerm[0] = points[i][0];
                minTerm[1] = points[i][1];
                minSum = currentSum;
            }
            if (currentSum > maxSum) {
                maxTerm[0] = points[i][0];
                maxTerm[1] = points[i][1];
                maxSum = currentSum;
            }
        }

        int newCompareTerm1[] = new int[] { maxTerm[0], minTerm[1] };
        int newCompareTerm2[] = new int[] { minTerm[0], maxTerm[1] };

        int[][] newComparePoints = Arrays.stream(points)
                .filter(subArray -> !Arrays.equals(subArray, minTerm) && !Arrays.equals(subArray, maxTerm))
                .toArray(int[][]::new);

        if (newComparePoints.length != 2) {
            return false;
        }

        boolean exists = Arrays.stream(newComparePoints).anyMatch(subArray -> Arrays.equals(subArray, newCompareTerm1))
                && Arrays.stream(newComparePoints).anyMatch(subArray -> Arrays.equals(subArray, newCompareTerm2));

        if (!exists) {
            int midX1 = minTerm[0] + newComparePoints[0][0];
            int midY1 = minTerm[1] + newComparePoints[0][1];
            int midX2 = maxTerm[0] + newComparePoints[1][0];
            int midY2 = maxTerm[1] + newComparePoints[1][1];

            int dist1 = (minTerm[0] - newComparePoints[0][0]) * (minTerm[0] - newComparePoints[0][0])
                    + (minTerm[1] - newComparePoints[0][1]) * (minTerm[1] - newComparePoints[0][1]);
            int dist2 = (maxTerm[0] - newComparePoints[1][0]) * (maxTerm[0] - newComparePoints[1][0])
                    + (maxTerm[1] - newComparePoints[1][1]) * (maxTerm[1] - newComparePoints[1][1]);

            boolean checkRotated1 = (midX1 == midX2 && midY1 == midY2 && dist1 == dist2);

            midX1 = minTerm[0] + newComparePoints[1][0];
            midY1 = minTerm[1] + newComparePoints[1][1];
            midX2 = maxTerm[0] + newComparePoints[0][0];
            midY2 = maxTerm[1] + newComparePoints[0][1];

            dist1 = (minTerm[0] - newComparePoints[1][0]) * (minTerm[0] - newComparePoints[1][0])
                    + (minTerm[1] - newComparePoints[1][1]) * (minTerm[1] - newComparePoints[1][1]);
            dist2 = (maxTerm[0] - newComparePoints[0][0]) * (maxTerm[0] - newComparePoints[0][0])
                    + (maxTerm[1] - newComparePoints[0][1]) * (maxTerm[1] - newComparePoints[0][1]);

            boolean checkRotated2 = (midX1 == midX2 && midY1 == midY2 && dist1 == dist2);

            exists = checkRotated1 || checkRotated2;
        }

        return exists && (minTerm[0] != maxTerm[0] || minTerm[1] != maxTerm[1]);
    }

    public static void main(String args[]) {
        System.out.println(isSquare(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } }));
        System.out.println(isSquare(new int[][] { { 0, 0 }, { 1, 1 }, { 1, 0 }, { 0, 2 } }));
        System.out.println(isSquare(new int[][] { { 1, 1 }, { 1, 0 }, { 0, 1 }, { 0, 0 } }));
    }
}