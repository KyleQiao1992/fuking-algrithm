package com.kaitian.fukingalgrithm.hash.no1_Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> valToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (valToIndex.containsKey(need)) {
                return new int[]{valToIndex.get(need), i};
            }

            valToIndex.put(nums[i], i);
        }
        return null;
    }
}
