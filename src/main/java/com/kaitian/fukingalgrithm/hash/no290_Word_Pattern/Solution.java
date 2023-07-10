package com.kaitian.fukingalgrithm.hash.no290_Word_Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();
        int n = pattern.length(), m = s.length();
        int i = 0;
        for (int p = 0; p < n; ++p) {
            if (i >= m) {
                return false;
            }
            int j = i;
            while (j < m && s.charAt(j) != ' ') {
                ++j;
            }
            String w = s.substring(i, j);
            char ch = pattern.charAt(p);
            if (str2ch.containsKey(w) && str2ch.get(w) != ch) {
                return false;
            }
            if (ch2str.containsKey(ch) && !w.equals(ch2str.get(ch))) {
                return false;
            }
            str2ch.put(w, ch);
            ch2str.put(ch, w);
            i = j + 1;
        }
        return i >= m;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.wordPattern("abba", "dog cat cat dog");
    }
}
