
/*
 * You are given an array prices where prices[il is the price of a given stock
 * on the ith day. You want to maximize your profit by choosing a single day to
 * buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return O.
*/
package Arrays;

public class _14_BestProfitFromStock {

    public static void maximumProfit(int prices[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;
        int buyingAndSellingDay[] = { 0, 0 };

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                if (maximumProfit < profit) {
                    buyingAndSellingDay[1] = i;
                }
                maximumProfit = Math.max(maximumProfit, profit);
            } else {
                buyingPrice = prices[i];
                buyingAndSellingDay[0] = i;
            }
        }

        if (maximumProfit == 0) {
            System.out.println("\nNo Profit");
            return;
        }

        System.out
                .println("\nBuy at day " + (buyingAndSellingDay[0] + 1) + "\nSell at day "
                        + (buyingAndSellingDay[1] + 1)
                        + "\nTo get the maximum profit of " + maximumProfit + "\n");
    }

    public static void main(String args[]) {
        int pricesArray[] = { 4, 1, 3, 2, 6, 5 };

        maximumProfit(pricesArray);
    }
}