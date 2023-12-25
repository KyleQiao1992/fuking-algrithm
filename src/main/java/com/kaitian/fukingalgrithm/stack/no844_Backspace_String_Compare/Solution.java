package com.kaitian.fukingalgrithm.stack.no844_Backspace_String_Compare;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Solution {

    public boolean backspaceCompare(String s, String t) {
        return backspaceSBuilder(s).equals(backspaceSBuilder(t));
    }

    private String backspaceSBuilder(String str) {
        Deque<Character> stk = new ArrayDeque<>();
        char[] s = str.toCharArray();
        for (char c : s) {
            if (c != '#') {
                stk.push(c);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        return stk.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
