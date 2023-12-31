package com.kaitian.fukingalgrithm.hash.no884_Uncommon_Words_from_Two_Sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> freq = new HashMap<String, Integer>();
        insert(s1, freq);
        insert(s2, freq);

        List<String> ans = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }

    public void insert(String s, Map<String, Integer> freq) {
        String[] arr = s.split(" ");
        for (String word : arr) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
    }

}
