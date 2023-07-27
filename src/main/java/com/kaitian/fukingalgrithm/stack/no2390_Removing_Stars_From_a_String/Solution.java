package com.kaitian.fukingalgrithm.stack.no2390_Removing_Stars_From_a_String;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {

    public String removeStars(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }


        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder(stack.stream().map(Object::toString).collect(Collectors.joining("")));
        return sb.reverse().toString();
    }
}
