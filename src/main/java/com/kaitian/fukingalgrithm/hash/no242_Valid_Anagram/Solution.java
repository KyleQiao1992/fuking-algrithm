package com.kaitian.fukingalgrithm.hash.no242_Valid_Anagram;

public class Solution {

    public boolean isAnagram(String s, String t) {
        int[] matrix = new int[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            matrix[idx]++;
        }

        for (char c : t.toCharArray()) {
            int idx = c - 'a';
            matrix[idx]--;
        }

        for (int c : matrix) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.isAnagram("anagram", "nagaram");
    }
}
