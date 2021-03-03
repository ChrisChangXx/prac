package com.chris.prac.leetcode;

import java.util.Arrays;

/**
 * solution338
 * 比特位运算
 *
 * @author zhangh
 * @date 2021/03/03
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution338().countBits(99)));
    }
}
