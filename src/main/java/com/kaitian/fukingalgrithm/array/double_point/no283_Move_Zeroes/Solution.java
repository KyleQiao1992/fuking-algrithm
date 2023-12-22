package com.kaitian.fukingalgrithm.array.double_point.no283_Move_Zeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        int p = removeElement(nums, 0);
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }

    private int removeElement(int[] nums, int val) {
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
        Solution f = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        f.moveZeroes(nums);
    }
}
