package com.kaitian.fukingalgrithm.stack.no1047_Remove_All_Adjacent_Duplicates_In_String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Solution {

    public String removeDuplicates(String s) {
        Deque<Character> stk = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            Character peek = stk.peek();

            if (ch.equals(peek)) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        String reverseStr = stk.stream().map(Object::toString).collect(Collectors.joining(""));
        StringBuilder sb = new StringBuilder(reverseStr);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.removeDuplicates("abbaca");
    }
}
