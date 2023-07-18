package com.kaitian.fukingalgrithm.backtrack.no46_Permutations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length <= 0) {
            return res;
        }
        this.used = new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    private void backtrack(int[] nums) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            track.addLast(nums[i]);
            used[i] = true;

            backtrack(nums);

            track.removeLast();
            used[i] = false;
        }
    }
}
