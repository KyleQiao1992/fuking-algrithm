package com.kaitian.fukingalgrithm.array._window.no438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int left = 0, right = 0;
        int valid = 0;

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char pChar = p.charAt(i);
            need.put(pChar, need.getOrDefault(pChar, 0) + 1);
        }

        while (right < s.length()) {
            char rChar = s.charAt(right);
            right++;
            if (need.containsKey(rChar)) {
                window.put(rChar, window.getOrDefault(rChar, 0) + 1);
                if (window.get(rChar).equals(need.get(rChar))) {
                    valid++;
                }
            }

            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    res.add(left);
                }
                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return res;
    }
}
