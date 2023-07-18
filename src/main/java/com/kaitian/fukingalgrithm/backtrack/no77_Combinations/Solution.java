package com.kaitian.fukingalgrithm.backtrack.no77_Combinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0) {
            return res;
        }
        this.k = k;
        backtrack(n, 1);
        return res;
    }

    private void backtrack(int n, int startIdx) {
        if (track.size() == k) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = startIdx; i <= n; i++) {
            track.addLast(i);
            backtrack(n, i + 1);
            track.removeLast();
        }
    }

}
