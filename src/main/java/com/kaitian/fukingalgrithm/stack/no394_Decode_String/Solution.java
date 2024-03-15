package com.kaitian.fukingalgrithm.stack.no394_Decode_String;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String decodeString(String s) {
        //初始化
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<String> strStack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else if (c == '[') {
                if (num > 0) numStack.push(num);
                strStack.push(sb.toString());
                sb = new StringBuilder();
                num = 0;
            } else {
                //c==']'
                StringBuilder preSB = new StringBuilder().append(strStack.pop());
                int times = numStack.pop();
                for (int j = 0; j < times; j++) {
                    preSB.append(sb);
                }
                sb = preSB;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.decodeString("3[a]2[bc]");
    }

}
