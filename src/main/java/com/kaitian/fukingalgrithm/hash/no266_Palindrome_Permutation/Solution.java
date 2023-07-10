package com.kaitian.fukingalgrithm.hash.no266_Palindrome_Permutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key : map.keySet()) {
            count += map.get(key) % 2;
        }
        return count <= 1;
    }

}
