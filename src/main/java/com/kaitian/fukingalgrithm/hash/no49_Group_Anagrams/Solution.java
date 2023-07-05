package com.kaitian.fukingalgrithm.hash.no49_Group_Anagrams;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> codeToGroup = new HashMap<>();

        for (String s : strs) {
            String code = encode(s);

            codeToGroup.putIfAbsent(code, new LinkedList<>());
            codeToGroup.get(code).add(s);
        }
        return new LinkedList<>(codeToGroup.values());
    }

    private String encode(String s) {
        char[] count = new char[26];
        for (int c : s.toCharArray()) {
            int delta = c - 'a';
            count[delta]++;
        }
        return new String(count);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        f.groupAnagrams(strings);
    }
}
