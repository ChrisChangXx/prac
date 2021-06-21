package com.chris.prac.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * solution452
 * 用最少数量的剑引爆气球
 *
 * @author zhangh
 * @date 2021/06/10
 */
public class Solution452 {
    public static int findMinArrowShots(int[][] points) {
        int length = points.length;
        if (length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int shots = 1;
        int rightBorder = points[0][1];
        for (int i = 1; i < length; i++) {
            if (rightBorder < points[i][0]) {
                shots++;
                rightBorder = points[i][1];
            }
        }
        return shots;
    }

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }
}
