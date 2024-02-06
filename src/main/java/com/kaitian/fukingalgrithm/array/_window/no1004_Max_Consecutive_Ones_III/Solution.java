package com.kaitian.fukingalgrithm.array._window.no1004_Max_Consecutive_Ones_III;

public class Solution {

    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int oneCnt = 0;
        int res = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                oneCnt++;
            }
            right++;

            while (right - left - oneCnt > k) {
                if (nums[left] == 1) {
                    oneCnt--;
                }
                left++;
            }

            res = Math.max(res, right - left);
        }
        return res;
    }
}
