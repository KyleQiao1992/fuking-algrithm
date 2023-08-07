package com.kaitian.fukingalgrithm.hash.no442_Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int[] count = new int[nums.length + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                res.add(i);
            }
        }
        return res;
    }
}
