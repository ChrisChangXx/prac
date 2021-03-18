package com.chris.prac.leetcode.everyday;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 *
 * @author zhangh
 * @date 2021/01/20
 */
public class Solution628 {

    public static void main(String[] args) {
        int[] nums = {
                1, 9, 4, 5, 6, 7, 8
        };
        System.out.println(maximumProduct(nums));
    }

    /**
     * 注意出现负数情况
     *
     * @param nums nums
     * @return int
     */
    private static int maximumProduct(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int length = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3], nums[0] * nums[1] + nums[length - 1]);
    }
}
