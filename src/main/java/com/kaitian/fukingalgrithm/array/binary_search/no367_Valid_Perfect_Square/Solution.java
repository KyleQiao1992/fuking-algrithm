package com.kaitian.fukingalgrithm.array.binary_search.no367_Valid_Perfect_Square;

public class Solution {

    public boolean isPerfectSquare(int num) {
        int res = mySqrt(num);
        return num == res * res;
    }

    private int mySqrt(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSqrt = (long) mid * mid;

            if (midSqrt > num) {
                right = mid - 1;
            } else if (midSqrt < num) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right;
    }
}
