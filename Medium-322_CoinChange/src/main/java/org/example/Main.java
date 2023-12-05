package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 100;
        //System.out.println("jest: " + coinChange(coins,amount));
        System.out.println(minCoins(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0; // koniec sciezki, nie moge zrobic wiecej ruchow
        }
        if ( amount < 0){
            return -1;
        }
        int bestScore = Integer.MAX_VALUE;
        for (int i = coins.length-1; i >= 0; i--) {
            int actualScore = 1;
            int returned = coinChange(coins,amount - coins[i]);
            actualScore += returned;
            if (actualScore < bestScore  && returned != -1){
                bestScore = actualScore;
            }
        }
        if (bestScore == Integer.MAX_VALUE){
            bestScore = -1;
        }
        return bestScore;
    }
    public static int minCoins(int[] coins, int amount) {
        if (amount == 0) { // Edge case where amount is 0.
            return 0;
        }

        final int[] dp = new int[amount + 1]; // amount + 1 to add space for the zero-case
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            System.out.println(Arrays.toString(dp));
            int minCoinsForCurrAmountSoFar = -1;
            boolean isFirstCoinForThisAmount = true;
            for (int coin : coins) { // For each coin {1,2,5}
                final int difference = currentAmount - coin;
                final boolean coinBiggerThanCurrentAmount = coin > currentAmount;

                // If dp[difference] is -1 then that amount cannot be created with the given coin combination
                if (!coinBiggerThanCurrentAmount && dp[difference] != -1) {
                    int minForCurrentCoin = dp[difference] + 1;

                    // Set min to either itself, dp[consigner_1 - coin] and 0, taking the lowest
                    if (isFirstCoinForThisAmount || minForCurrentCoin < minCoinsForCurrAmountSoFar) {
                        isFirstCoinForThisAmount = false;
                        minCoinsForCurrAmountSoFar = minForCurrentCoin;
                    }
                }
            }
            dp[currentAmount] = minCoinsForCurrAmountSoFar;
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}