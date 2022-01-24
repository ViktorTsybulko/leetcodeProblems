package com.company;
/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
* You can return the answer in any order.
*
* Example 1:
*
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++){

            for (int j = 0; j < nums.length; j++){
                if((nums[i] + nums[j] == target) && (i != j)){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
    return result;
    }
}
