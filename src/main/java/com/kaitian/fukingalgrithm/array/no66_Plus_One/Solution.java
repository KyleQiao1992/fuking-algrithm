package com.kaitian.fukingalgrithm.array.no66_Plus_One;

public class Solution {

    public int[] plusOne(int[] digits) {
        int[] digitsNew = new int[digits.length + 1];

        int next = 0;
        boolean useNew = false;
        boolean isLast = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = digits[i] + next;
            if (isLast) {
                res = res + 1;
                isLast = false;
            }

            if (i == 0 && res >= 10) {
                digitsNew[i] = res - 10;
                digitsNew[0] = 1;
                useNew = true;
                break;
            }

            if (res >= 10) {
                digits[i] = res - 10;
                digitsNew[i] = res - 10;
                next = 1;
            } else {
                digits[i] = res;
                digitsNew[i] = res;
                next = 0;
            }
        }

        return useNew ? digitsNew : digits;
    }

    public static void main(String[] args) {
        int[] nums = {9, 9, 9};
        Solution f = new Solution();
        f.plusOne(nums);
    }
}
