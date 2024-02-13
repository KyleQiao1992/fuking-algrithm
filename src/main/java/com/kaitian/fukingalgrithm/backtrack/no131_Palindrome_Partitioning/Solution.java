package com.kaitian.fukingalgrithm.backtrack.no131_Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {


    private List<List<String>> res = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, 0);
        return res;
    }

    private void backtrack(String s, int startIdx) {
        if (startIdx == s.length()) {
            res.add(new ArrayList<>(path));
        }

        for (int i = startIdx; i < s.length(); i++) {
            if (!isPalindrome(s, startIdx, i)) {
                continue;
            }
            path.addLast(s.substring(startIdx, i + 1));
            backtrack(s, i + 1);
            path.removeLast();
        }
    }

    private boolean isPalindrome(String s, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            if (s.charAt(startIdx) != s.charAt(endIdx)) {
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }
}
