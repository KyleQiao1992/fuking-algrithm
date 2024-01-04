package com.kaitian.fukingalgrithm.array._double_point.no26_Remove_Duplicates_from_Sorted_Array;

public class Solution {

    //fast 探索
    //slow 标记
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;

        while (fast <= nums.length - 1) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];

            }
            fast++;
        }
        //slow 是数组的index,但是返回的是个数
        return slow + 1;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        f.removeDuplicates(nums);
    }
}
