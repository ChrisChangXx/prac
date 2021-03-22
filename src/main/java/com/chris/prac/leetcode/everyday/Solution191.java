package com.chris.prac.leetcode.everyday;

/**
 * solution191
 * 位1的个数问题
 * 输入十进制整数，返回二进制中1的个数
 *
 * @author zhangh
 * @date 2021/03/22
 */
public class Solution191 {
    /**
     * 汉明重量计算
     * 该方式利用一下算法
     * n & (n - 1)得到的数的二进制正好是最低位1变成0的结果
     * 6 & (6 - 1)得到的是4
     * 6的二进制数为110、4的二进制数为100
     *
     * @param n n
     * @return int
     */
    public static int hammingWeight1(int n) {
        int ret = 0;
        while (n != 0) {
            n &= (n - 1);
            ret++;
        }
        return ret;
    }

    /**
     * 汉明重量计算2
     * 该方法循环比较每一位是否为1
     * 假设n=5
     * 101  101  101
     * 001  010  100
     * 001  000  100
     * 不等于0则+1
     *
     * @param n n
     * @return int
     */
    public static int hammingWeight2(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight1(19));
        System.out.println(hammingWeight2(19));
    }
}
