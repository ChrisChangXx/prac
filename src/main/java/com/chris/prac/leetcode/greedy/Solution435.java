package com.chris.prac.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * solution435
 * 无重叠区间
 *
 * @author zhangh
 * @date 2021/06/10
 */
public class Solution435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        if (length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int initRightBorder = intervals[0][1];
        int res = 0;
        for (int i = 1; i < length; i++) {
            if (intervals[i][0] < initRightBorder) {
                res++;
            } else {
                initRightBorder = intervals[i][1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
