package com.kaitian.fukingalgrithm.array._window.no219_Contains_Duplicate_II;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0, right = 0;

        Set<Integer> set = new HashSet<>();

        while (right < nums.length) {
            int rightVal = nums[right];
            right++;
            if (set.contains(rightVal)) {
                return true;
            }
            set.add(rightVal);

            if (Math.abs(left - right) > k) {
                int leftVal = nums[left];
                set.remove(leftVal);
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }
}
