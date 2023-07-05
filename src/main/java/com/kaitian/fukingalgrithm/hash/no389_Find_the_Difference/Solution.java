package com.kaitian.fukingalgrithm.hash.no389_Find_the_Difference;

public class Solution {

    public char findTheDifference(String s, String t) {

        for (char sChar : s.toCharArray()) {
            t = t.replaceFirst(String.valueOf(sChar), String.valueOf(""));
        }

        return t.charAt(0);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.findTheDifference("abcd", "abcde");
    }
}
