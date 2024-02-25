package com.kaitian.fukingalgrithm.stack.mono_stack.no739_Daily_Temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]) {
                stk.pop();
            }

            res[i] = stk.isEmpty() ? 0 : (stk.peek() - i);
            stk.push(i);
        }
        return res;
    }
}
