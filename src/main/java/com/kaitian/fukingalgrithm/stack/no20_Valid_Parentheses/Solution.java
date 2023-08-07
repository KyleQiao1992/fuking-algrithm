package com.kaitian.fukingalgrithm.stack.no20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() &&
                        leftOf(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private char leftOf(char c) {
        if (c == '}') {
            return '{';
        }
        if (c == ']') {
            return '[';
        }
        return '(';
    }
}
