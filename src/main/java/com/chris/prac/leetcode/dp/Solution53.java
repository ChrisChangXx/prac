package com.chris.prac.leetcode.dp;

/**
 * solution53
 * 最大子序列和
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 *
 * @author zhangh
 * @date 2021/11/15
 */
public class Solution53 {
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int num : nums) {
            pre = Math.max(num, pre + num);
            res = Math.max(res, pre);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] param = {2, 4, -2, 6, -7, 9, 3, -6};
        System.out.println(maxSubArray(param));
    }
}
