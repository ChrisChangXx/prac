package com.chris.prac.leetcode.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * solution523
 * 连续的子数组和
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/2
 * @描述
 * @date 2021/06/02
 */
public class Solution523 {

    public static boolean checkSubarraySum(int[] nums, int k) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        int remainder = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                Integer preIndex = map.get(remainder);
                if (i - preIndex > 1) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {
                23, 2, 4, 6, 7
        };
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
