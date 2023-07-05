package com.kaitian.fukingalgrithm.hash.no389_Find_the_Difference;

public class Solution2 {

    public char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res = res ^ c;
        }
        for (char d : t.toCharArray()) {
            res = res ^ d;
        }
        return (char) res;
    }
}
