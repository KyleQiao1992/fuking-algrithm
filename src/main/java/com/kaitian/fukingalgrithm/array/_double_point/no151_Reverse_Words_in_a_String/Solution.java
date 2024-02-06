package com.kaitian.fukingalgrithm.array._double_point.no151_Reverse_Words_in_a_String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Solution {

    public String reverseWords(String s) {
        String[] sList = s.split(" ");
        Deque<String> stk = new ArrayDeque<>();

        for (String str : sList) {
            if ("".equals(str)) {
                continue;
            }
            stk.push(str);
        }

        return stk.stream().map(Object::toString).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.reverseWords("a good   example");
    }
}
