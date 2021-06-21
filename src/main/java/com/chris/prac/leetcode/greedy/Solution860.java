package com.chris.prac.leetcode.greedy;

/**
 * solution860
 * 柠檬水找零
 *
 * @author zhangh
 * @date 2021/06/09
 */
public class Solution860 {
    public static boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                if (fiveCount == 0) {
                    return false;
                }
                fiveCount--;
                tenCount++;
            } else {
                if (fiveCount > 0 && tenCount > 0) {
                    fiveCount--;
                    tenCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(arr));
    }
}
