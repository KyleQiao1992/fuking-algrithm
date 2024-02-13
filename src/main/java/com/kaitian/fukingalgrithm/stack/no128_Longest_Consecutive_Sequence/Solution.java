package com.kaitian.fukingalgrithm.stack.no128_Longest_Consecutive_Sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> set = new HashSet<>();

    public int longestConsecutive(int[] nums) {
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;

        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }

            int curNum = num;
            int curLen = 1;

            while (set.contains(curNum + 1)) {
                curNum++;
                curLen++;
            }
            res = Math.max(res, curLen);
        }
        return res;
    }
}
