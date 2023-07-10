package com.kaitian.fukingalgrithm.hash.no217_Contains_Duplicate;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> keyCntKey = new HashSet<>();

        for (int num : nums) {
            if (keyCntKey.contains(num)) {
                return true;
            }
            keyCntKey.add(num);
        }

        return false;
    }
}
