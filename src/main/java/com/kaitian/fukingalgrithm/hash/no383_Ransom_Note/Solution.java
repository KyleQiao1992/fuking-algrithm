package com.kaitian.fukingalgrithm.hash.no383_Ransom_Note;


public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomMatrix = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomMatrix[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (ransomMatrix[magazine.charAt(i) - 'a'] != 0) {
                ransomMatrix[magazine.charAt(i) - 'a']--;
            }
        }

        for (int num : ransomMatrix) {
            if (num > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.canConstruct("aa", "aab");
    }
}
