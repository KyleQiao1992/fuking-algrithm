package com.kaitian.fukingalgrithm.array.no69_Sqrtx;

public class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSqrt = (long) mid * mid;

            if (midSqrt < x) {
                left = mid + 1;
            } else if (midSqrt > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.mySqrt(8);
    }
}
