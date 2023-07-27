package com.kaitian.fukingalgrithm.hash.no1207_Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> keyVal = new HashMap<>();

        for (int e : arr) {
            if (!keyVal.containsKey(e)) {
                keyVal.put(e, 1);
            } else {
                keyVal.put(e, keyVal.get(e) + 1);
            }
        }

        Set<Integer> valueSet = new HashSet<>();
        for (Integer key : keyVal.keySet()) {
            valueSet.add(keyVal.get(key));
        }
        return valueSet.size() == keyVal.size();
    }
}
