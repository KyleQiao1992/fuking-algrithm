package com.kaitian.fukingalgrithm.backtrack.no47_Permutations_II;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
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

            if (i > 0 && nums[i] == nums[i = 1] && !used[i - 1]) {
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }
}
