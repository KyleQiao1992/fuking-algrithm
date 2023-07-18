package com.kaitian.fukingalgrithm.backtrack.no78_Subsets;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);

        return res;
    }

    private void backtrack(int[] nums, int start) {
        res.add(new LinkedList<>(track));

        for (int i = start; i < nums.length; i++) {

            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.subsets(new int[]{1, 2, 3});
    }
}
