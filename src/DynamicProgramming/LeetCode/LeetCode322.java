package DynamicProgramming.LeetCode;

import java.util.Arrays;

public class LeetCode322 {
    public static int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }
        for (int j = 0; j < amount+1; j++) {
            System.out.print(minCoins[j] + " ");
        }
        System.out.println();

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;
    }
    public static void main(String[] args) {
        int coins[] = {6,6,5};
        int amt = 13;
        int ans = coinChange(coins,amt);
        System.out.println(ans);
    }
}
