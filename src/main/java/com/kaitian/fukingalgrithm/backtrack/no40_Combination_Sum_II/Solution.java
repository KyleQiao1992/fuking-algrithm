package com.kaitian.fukingalgrithm.backtrack.no40_Combination_Sum_II;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }
        this.target = target;
        Arrays.sort(candidates);
        backtrack(candidates, 0);
        return res;
    }

    private int sum = 0;

    private void backtrack(int[] nums, int start) {
        if (sum == target) {
            res.add(new LinkedList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }


        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i - 1] == nums[i]) {
                continue;
            }

            track.addLast(nums[i]);
            sum += nums[i];
            backtrack(nums, i + 1);
            track.removeLast();
            sum -= nums[i];
        }
    }
}
