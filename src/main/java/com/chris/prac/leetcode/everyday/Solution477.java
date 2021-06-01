package com.chris.prac.leetcode.everyday;

/**
 * solution477
 * 汉明距离总和
 *
 * @author zhangh
 * @date 2021/06/01
 */
public class Solution477 {
    private static int totalHammingDistance(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < 30; ++i) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            res += (n - c) * c;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{
                4, 14, 4
        };
        System.out.println(totalHammingDistance(nums));
    }
}
