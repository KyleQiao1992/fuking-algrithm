package com.kaitian.fukingalgrithm.backtrack.no216_Combination_Sum_III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    private int sum = 0;
    private int target;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.target = n;
        backtracking(k, 1);
        return res;
    }

    private void backtracking(int k, int startIndex) {
        if (sum > target) {
            return;
        }

        if (path.size() == k && sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backtracking(k, i + 1);
            path.removeLast();
            sum -= i;
        }
    }
}
