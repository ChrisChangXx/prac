package com.chris.prac.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Test {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }

        return false;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int i = m - 1;
        int j = n - 1;
        int res = m + n - 1;
        while (j >= 0) {
            nums1[res--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }*/
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
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

    private static int hammingDistance(int x, int y) {
        int res = x ^ y;
        int num = 0;
        while (res != 0) {
            num += res & 1;
            res >>= 1;
        }
        return num;
    }
}
