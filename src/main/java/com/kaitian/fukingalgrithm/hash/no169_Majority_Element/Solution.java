package com.kaitian.fukingalgrithm.hash.no169_Majority_Element;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = build(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }

    private Map<Integer, Integer> build(int[] nums) {
        Map<Integer, Integer> keyCntMap = new HashMap<>();

        for (int num : nums) {
            if (keyCntMap.containsKey(num)) {
                Integer cnt = keyCntMap.get(num);
                cnt++;

                keyCntMap.put(num, cnt);
            } else {
                keyCntMap.put(num, 1);
            }
        }
        return keyCntMap;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 2};
        f.majorityElement(nums);
    }
}
