package com.kaitian.fukingalgrithm.sort.merge_sort.no315_Count_of_Smaller_Numbers_After_Self;

import java.util.ArrayList;
import java.util.List;

//这个超时，但是解法是对的
public class Solution {
    public List<Integer> countSmaller(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {5, 2, 6, 1};
        List<Integer> res = f.countSmaller(nums);
    }
}
