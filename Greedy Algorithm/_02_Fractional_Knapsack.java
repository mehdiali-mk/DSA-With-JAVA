/*
Fractional Knapsack
Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

value [60, 100, 120]
weight = [10, 20, 30]
w = 50

ans = 240

*/

import java.util.Comparator;
import java.util.Arrays;

public class _02_Fractional_Knapsack {
    public static void main(String args[]) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int knapsackCapacity = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = knapsackCapacity;
        int maximumValueKnapsack = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {
                maximumValueKnapsack += value[index];
                capacity -= weight[index];
            } else {
                maximumValueKnapsack += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("\n\n\n\nKnapsack Maximum Value = " + maximumValueKnapsack + "\n\n\n\n");
    }
}
