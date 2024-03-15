package com.kaitian.fukingalgrithm.dp.no494_Target_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int findTargetSumWays(int[] nums, int target) {
        return dp(nums, 0, target);
    }

    Map<String, Integer> memo = new HashMap<>();

    private int dp(int[] nums, int i, int remain) {
        if (i == nums.length) {
            if (remain == 0) {
                return 1;
            }
            return 0;
        }

        String key = i + "," + remain;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = dp(nums, i + 1, remain - nums[i]) +
                dp(nums, i + 1, remain + nums[i]);

        memo.put(key, result);
        return result;
    }
}
