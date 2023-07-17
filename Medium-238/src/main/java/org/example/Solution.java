package org.example;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ret = productExceptSelf(nums);
        for (int n : ret) {
            System.out.print(n + " ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        int rightProd = 1;
        for (int i = n-1; i >= 0; i--) {
            answer[i] *= rightProd;
            rightProd *= nums[i];
        }
        return answer;
    }
}
