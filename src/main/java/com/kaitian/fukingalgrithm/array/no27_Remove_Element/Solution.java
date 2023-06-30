package com.kaitian.fukingalgrithm.array.no27_Remove_Element;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 4};
        Solution f = new Solution();
        f.removeElement(nums, 3);
    }
}
