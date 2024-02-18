package com.kaitian.fukingalgrithm.stack.mono_stack.no739_Daily_Temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(0);

        //stk存的是索引
        for (int i = 1; i < len; i++) {
            if (temperatures[i] <= temperatures[stk.peek()]) {
                stk.push(i);
            } else {
                while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                    res[stk.peek()] = i - stk.peek();
                    stk.pop();
                }
                stk.push(i);
            }
        }
        return res;
    }
}
