package org.example;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.abs;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * <p>
 * <p>
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class Main {
    public static void main(String[] args) {
        int[] numss2 = {2,7,11,15};
        System.out.println(Arrays.toString((twoSum(numss2, 9))));
        int[] numss = {-3,4,3,90};
        System.out.println(Arrays.toString((twoSum(numss, 0))));
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString((twoSum(nums, -8))));
        int[] nums2 = {0,4,3,0};
        System.out.println(Arrays.toString((twoSum(nums2, 0))));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = {0,0};

        //Value, Index
        HashMap<Integer,Integer> difference= new HashMap<>();
        int diff;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];

            if (difference.containsKey(diff)){

                output[0] = difference.get(diff);
                output[1] = i;
                return output;
            }

                difference.put(nums[i],i);
        }

        return output;

    }
}