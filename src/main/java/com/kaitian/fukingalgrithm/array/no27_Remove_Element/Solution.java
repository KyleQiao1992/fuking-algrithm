package com.kaitian.fukingalgrithm.array.no27_Remove_Element;

public class Solution {

    //fast:寻找新数组的元素 ，新数组就是不含有目标元素的数组
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
