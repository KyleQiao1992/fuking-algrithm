package com.kaitian.fukingalgrithm.array._window.no3_Longest_Substring_Without_Repeating_Characters;

import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int left = 0;
        int right = 0;
        int res = 0;

        while (left < s.length()) {
            if (right  < s.length() && map[s.charAt(right )] == 0) {
                map[s.charAt(right)]++;
                right++;
            } else {
                map[s.charAt(left)]--;
                left++;
            }

            res = Math.max(res, right - left);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.lengthOfLongestSubstring("abcabcbb");
    }
}
