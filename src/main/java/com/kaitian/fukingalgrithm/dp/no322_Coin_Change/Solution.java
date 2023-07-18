package com.kaitian.fukingalgrithm.dp.no322_Coin_Change;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//回溯法
public class Solution {

    //    private List<List<Integer>> res = new ArrayList<>();
    private Integer res = Integer.MAX_VALUE;
    private LinkedList<Integer> track = new LinkedList<>();
    private int target;

    public int coinChange(int[] coins, int amount) {

        this.target = amount;
        backtrack(coins);
        return res == Integer.MAX_VALUE ? -1 : res;
    }


    private int sum = 0;

    private void backtrack(int[] nums) {
        if (target == sum) {
            res = Math.min(res, track.size());
//            res.add(new LinkedList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            track.addLast(nums[i]);
            sum += nums[i];

            backtrack(nums);

            track.removeLast();
            sum -= nums[i];
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.coinChange(new int[]{1, 2, 5}, 11);
    }
}
