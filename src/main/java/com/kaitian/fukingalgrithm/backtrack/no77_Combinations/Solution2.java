package com.kaitian.fukingalgrithm.backtrack.no77_Combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return res;
    }

    private void backtracking(int n, int k, int startIdx) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        //已选择元素个数： path.size();
        //还需要元素个数：k-path.size();
        //是从1开始的所以短一个
        for (int i = startIdx; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
