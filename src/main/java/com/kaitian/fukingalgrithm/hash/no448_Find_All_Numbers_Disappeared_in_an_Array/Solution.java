package com.kaitian.fukingalgrithm.hash.no448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }

        List<Integer> res = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            if (count[num] == 0) {
                res.add(num);
            }
        }
        return res;
    }
}
