package com.kaitian.fukingalgrithm.array.no525_Contiguous_Array;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + (nums[i] == 0 ? -1 : 1);
        }

        Map<Integer, Integer> valToIndex = new HashMap<>();
        int res = 0;
        for (int i = 0; i < preSum.length; i++) {
            if (!valToIndex.containsKey(preSum[i])) {
                valToIndex.put(preSum[i], i);
            } else {
                res = Math.max(res, i - valToIndex.get(preSum[i]));
            }
        }

        return res;
    }
}
