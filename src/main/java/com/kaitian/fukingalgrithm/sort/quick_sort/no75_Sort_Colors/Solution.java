package com.kaitian.fukingalgrithm.sort.quick_sort.no75_Sort_Colors;

public class Solution {

    public void sortColors(int[] nums) {
        int[] count = {0, 0, 0};

        for (int num : nums) {
            count[num]++;
        }

        int idx = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[idx++] = 0;
        }

        for (int i = 0; i < count[1]; i++) {
            nums[idx++] = 1;
        }

        for (int i = 0; i < count[2]; i++) {
            nums[idx++] = 2;
        }
    }
}
