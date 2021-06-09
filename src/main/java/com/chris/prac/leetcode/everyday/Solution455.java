package com.chris.prac.leetcode.everyday;

/**
 * solution455
 * 分发饼干
 *
 * @author zhangh
 * @date 2021/06/09
 */
public class Solution455 {

    /**
     * 冒泡排序+贪心算法
     * 发现内容孩子
     * g是小朋友满足值数组
     * s是糖果满足值数组
     *
     * @param g g
     * @param s 年代
     * @return int
     */
    public static int findContentChildren(int[] g, int[] s) {
        sort(g);
        sort(s);

        int res = 0;
        int gLength = g.length;
        int sLength = s.length;
        for (int i = 0, j = 0; i < gLength && j < sLength; i++, j++) {
            while (j < sLength && g[i] > s[j]) {
                j++;
            }
            if (j < sLength) {
                res++;
            }
        }

        return res;
    }

    /**
     * 排序
     * 冒泡排序
     *
     * @param arr 加勒比海盗
     * @return {@link int[]}
     */
    private static int[] sort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j < length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(findContentChildren(g, s));
    }

}
