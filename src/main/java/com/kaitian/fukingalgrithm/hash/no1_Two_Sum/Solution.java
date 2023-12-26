package com.kaitian.fukingalgrithm.hash.no1_Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int surplus = target - nums[i];
            if (map.containsKey(surplus)) {
                res[1] = i;
                res[0] = map.get(surplus);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
