package com.chris.prac.leetcode.everyday;

/**
 * solution303
 * 区域和检索-数组不可变
 *
 * @author zhangh
 * @date 2021/03/01
 */
public class Solution303 {

    public static class NumArray {
        int[] sums;

        NumArray(int[] nums) {
            int n = nums.length;
            sums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(2, 5));
    }
}
