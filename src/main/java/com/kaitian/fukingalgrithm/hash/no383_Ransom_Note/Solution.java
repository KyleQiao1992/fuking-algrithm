package com.kaitian.fukingalgrithm.hash.no383_Ransom_Note;


public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineCntList = new int[26];
        for (char c : magazine.toCharArray()) {
            magazineCntList[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            int cnt = magazineCntList[c - 'a'];
            if (cnt <= 0) {
                return false;
            }
            magazineCntList[c - 'a']--;
        }
        return true;
    }
}
