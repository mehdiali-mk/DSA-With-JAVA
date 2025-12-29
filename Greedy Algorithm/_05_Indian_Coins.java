
import java.util.*;

public class _05_Indian_Coins {
    public static void main(String args[]) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> answer = new ArrayList<>();

        System.out.println("\n\n\nFor Rupees = " + amount);

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    amount -= coins[i];
                    answer.add(coins[i]);
                }
            }
        }

        System.out.println("Coins are needed = " + countOfCoins);
        System.out.print("\nHere are the coins: [ ");
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        System.out.println("]\n\n\n");
    }
}
