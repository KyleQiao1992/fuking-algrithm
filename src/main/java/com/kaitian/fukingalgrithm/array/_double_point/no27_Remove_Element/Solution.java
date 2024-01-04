package com.kaitian.fukingalgrithm.array._double_point.no27_Remove_Element;

public class Solution {

    //fast:找新元素
    //slow:指向更新 新数组下标的位置
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;

        while (fast <= nums.length - 1) {
            if (val != nums[fast]) {
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
