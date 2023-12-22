package com.kaitian.fukingalgrithm.array.double_point.no283_Move_Zeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        int slow = removeElement(nums, 0);

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    private int removeElement(int[] nums, int target) {
        int fast = 0;
        int slow = 0;
        while (fast <= nums.length - 1) {
            if (target == nums[fast]) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        f.moveZeroes(nums);
    }
}
