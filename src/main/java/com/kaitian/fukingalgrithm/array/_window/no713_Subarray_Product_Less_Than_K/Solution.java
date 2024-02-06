package com.kaitian.fukingalgrithm.array._window.no713_Subarray_Product_Less_Than_K;

public class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0;
        int windowProduct = 1;
        int res = 0;

        while (right < nums.length) {
            windowProduct = windowProduct * nums[right];
            right++;

            while (left < right && windowProduct >= k) {
                windowProduct = windowProduct / nums[left];
                left++;
            }

            res += right - left;
        }
        return res;
    }
}
