package com.chris.prac.leetcode.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * solution525
 * 连续数组
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/3
 * @描述
 * @date 2021/06/03
 */
public class Solution525 {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(counter, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                counter++;
            } else {
                counter--;
            }
            if (map.containsKey(counter)) {
                Integer preIndex = map.get(counter);
                maxLength = Math.max(maxLength, i - preIndex);
            } else {
                map.put(counter, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{
                0, 1, 0, 0, 1, 0
        }));
    }
}
