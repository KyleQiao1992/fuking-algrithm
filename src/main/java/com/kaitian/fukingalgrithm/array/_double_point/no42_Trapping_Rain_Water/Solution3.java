package com.kaitian.fukingalgrithm.array._double_point.no42_Trapping_Rain_Water;

public class Solution3 {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int lMax = 0;
        int rMax = 0;

        int res = 0;
        while (left < right) {
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);

            if (lMax < rMax) {
                res += lMax - height[left];
                left++;
            } else {
                res += rMax - height[right];
                right--;
            }
        }

        return res;
    }
}
