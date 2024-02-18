package com.kaitian.fukingalgrithm.array._double_point.no42_Trapping_Rain_Water;

public class Solution {

    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lMax = 0, rMax = 0;

            for (int j = i; j < n; j++) {
                rMax = Math.max(rMax, height[j]);
            }
            for (int j = i; j >= 0; j--) {
                lMax = Math.max(lMax, height[j]);
            }

            res += Math.min(lMax, rMax) - height[i];
        }
        return res;
    }
}
