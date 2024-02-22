package org.example;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */
public class Main {
    public static void main(String[] args) {
        int[] values = {-1,0,3,5,9,12};
        int index =search(values,2);
        System.out.println("1: " + index);

        int[] values2 = {-1,0,3,5,9,12};
        int index2 =search(values2,9);
        System.out.println("2: "+index2);
        /**
         * lft = 0 rght = 5 mid = 2, val = 3
         * left = 2 right =5 mid = 2+ 1 = 3
         * left = 3 right = 5 mid =
         */
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {

            int middle = left + (right-left)/2;
            int value = nums[middle];

            if (value == target) {
                return middle;
            } else if (value < target) {
                left = middle +1;
            } else {
                right = middle -1;
            }
        }
        return -1;
    }
}