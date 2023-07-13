package com.kaitian.fukingalgrithm.traceback.no40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private int trackSum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);

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
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            track.add(nums[i]);
            trackSum += nums[i];
            backtrack(nums, i + 1, target);
            track.removeLast();
            trackSum -= nums[i];
        }
    }

}
