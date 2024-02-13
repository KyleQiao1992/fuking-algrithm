package com.kaitian.fukingalgrithm.backtrack.no491_Non_decreasing_Subsequences;

import java.util.*;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        if (nums == null || nums.length == 0) {
            return res;
        }
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int startIdx) {
        if (path.size() >= 2) {
            res.add(new ArrayList<>(path));
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = startIdx; i < nums.length; i++) {
            if (!path.isEmpty() && path.getLast() > nums[i]) {
                continue;
            }
            if (set.contains(nums[i])) {
                continue;
            }

            set.add(nums[i]);
            path.add(nums[i]);
            backtrack(nums, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.findSubsequences(new int[]{4, 6, 7, 7});
    }
}
