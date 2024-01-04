package com.kaitian.fukingalgrithm.array._window.no567_Permutation_in_String;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0;
        int valid = 0;
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char s1Char = s1.charAt(i);
            need.put(s1Char, need.getOrDefault(s1Char, 0) + 1);
        }

        while (right < s2.length()) {
            char rChar = s2.charAt(right);
            right++;
            if (need.containsKey(rChar)) {
                window.put(rChar, window.getOrDefault(rChar, 0) + 1);
                if (window.get(rChar).equals(need.get(rChar))) {
                    valid++;
                }
            }

            while (right - left >= need.size()) {
                if (valid == need.size()) {
                    return true;
                }
                char lChar = s2.charAt(left);
                left++;
                if (need.containsKey(lChar)) {
                    if (window.get(lChar).equals(need.get(lChar))) {
                        valid--;
                    }
                    window.put(lChar, window.getOrDefault(lChar, 0) - 1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.checkInclusion("ab", "eidbaooo");
    }
}
