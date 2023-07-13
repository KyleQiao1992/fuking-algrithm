package com.kaitian.fukingalgrithm.traceback.no39_Combination_Sum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private int trackSum = 0;


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }

        backtrack(candidates, 0, target);
        return res;
    }

    private void backtrack(int[] nums, int start, int target) {
        if (trackSum == target) {
            res.add(new LinkedList<>(track));
            return;
        }

        if (trackSum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            trackSum += nums[i];
            track.add(nums[i]);

            backtrack(nums, i , target);

            trackSum -= nums[i];
            track.removeLast();
        }
    }
}
