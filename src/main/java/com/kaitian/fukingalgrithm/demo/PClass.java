package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class PClass {
    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        this.used = new boolean[nums.length];
        Arrays.sort(nums);
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
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            track.add(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        PClass f = new PClass();
        Integer[] nums = {1, 2, 3, null, null, 4, 5};
        TreeNode node = TreeNode.constructTree(nums);
//        f.subsets(new int[]{1, 2, 3});
    }

}
