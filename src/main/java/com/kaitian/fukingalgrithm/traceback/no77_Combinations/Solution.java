package com.kaitian.fukingalgrithm.traceback.no77_Combinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> trace = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrace(n, 1, k);
        return res;
    }

    private void backtrace(int n, int start, int k) {
        if (trace.size() == k) {
            res.add(new LinkedList<>(trace));
        }

        for (int i = start; i <= n; i++) {
            trace.addLast(i);

            backtrace(n, i + 1, k);

            trace.removeLast();
        }
    }
}
