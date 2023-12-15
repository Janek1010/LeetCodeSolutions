package org.example;

import java.util.Arrays;
import java.util.Collections;

/***
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * Based on the fact that we have to sell after we buy and we are trying to maximize profit, we can iterate through the prices and only need to consider two things:
 * 1.) Is this price cheaper than any other price I've seen before?
 * 2.) If I subtract current price by the cheapest price I've found, does this yield a greater profit than what I've seen so far?
 *
 * A fun thing to note is if #1 is true, then #2 cannot be true as well so there isn't a need to check
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int value = prices[i];
            int diff = value-buyPrice;
            if ((diff) > bestProfit){
                bestProfit = value-diff;
            }
            if (value < buyPrice){
                buyPrice = value;
            }
        }
        return bestProfit;
    }
}