package com.kaitian.fukingalgrithm.backtrack.no90_Subsets_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int start) {
        res.add(new LinkedList<>(track));

        for (int i = start; i < nums.length; i++) {
            //start 其实是树的高度也是层数，i是当前的层数，i>start 的意思是不同层之间可以重，但是相同层之间不能重
            //比如 122‘  start=0 i=0 [1] start=1,i=1 [1,2] start=2 i=2 [1,2,2'] 但是回溯的时候
            // start=1 i=2 代表的是树的同一层 也就是 [1,2'] 这里就是同一层的数据不能重复
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();
        }
    }
}
