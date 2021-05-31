package com.chris.prac.leetcode.everyday;

/**
 * solution231
 * 4的幂
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * @author zhangh
 * @date 2021/05/31
 */
public class Solution342 {

    private static boolean isPowerOfFour(int n) {
        int mask = 0xaaaaaaaa;
        return n > 0 && (n & (n - 1)) == 0 && (n & mask) == 0;
    }

    private static boolean isPowerOfFour2(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int res = n;
        int num = 0;
        int count = 0;
        while (res != 0) {
            num += res & 1;
            if (num > 1) {
                return false;
            }
            res >>= 1;
            count++;
        }

        return count % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }
}
