package com.kaitian.fukingalgrithm.hash.no1133_Largest_Unique_Number;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int res = -1;

        for (int num : nums) {
            if (map.get(num) == 1) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
