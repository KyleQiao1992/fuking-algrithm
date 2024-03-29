package com.kaitian.fukingalgrithm.hash.no169_Majority_Element;

public class Solution2 {

    public int majorityElement(int[] nums) {
        int target = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                target = nums[i];
                count = 1;
            } else if (nums[i] == target) {
                count++;
            } else {
                count--;
            }
        }

        return target;
    }
}
