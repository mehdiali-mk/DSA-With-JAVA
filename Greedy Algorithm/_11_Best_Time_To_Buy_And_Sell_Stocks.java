public class _11_Best_Time_To_Buy_And_Sell_Stocks {
    static int maximumProfit(int prices[], int number) {
        int buy = prices[0], maximumProfit = 0;

        for (int i = 0; i < number; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maximumProfit) {
                maximumProfit = prices[i] - buy;
            }
        }

        return maximumProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 6, 4 };
        int number = prices.length;

        int maximumProfit = maximumProfit(prices, number);

        System.out.print("\n\n\nPrices = [");
        for (int i = 0; i < number; i++) {
            System.out.print(" " + prices[i]);
        }
        System.out.println(" ]");

        System.out.println("Maximum Profit = " + maximumProfit + "\n\n\n");
    }
}