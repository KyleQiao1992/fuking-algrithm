package com.kaitian.fukingalgrithm.stack.no150_Evaluate_Reverse_Polish_Notation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private Deque<Integer> stack = new ArrayDeque<>();

    public int evalRPN(String[] tokens) {

        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int a = stack.pop();
                int b = stack.pop();

                cal(token, a, b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private void cal(String token, int a, int b) {
        switch (token) {
            case "+":
                stack.push(a + b);
                break;
            case "-":
                stack.push(b - a);
                break;
            case "*":
                stack.push(a * b);
                break;
            case "/":
                stack.push(b / a);
                break;
        }
    }
}
