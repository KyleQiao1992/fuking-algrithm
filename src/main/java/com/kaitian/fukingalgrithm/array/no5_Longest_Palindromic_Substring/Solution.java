package com.kaitian.fukingalgrithm.array.no5_Longest_Palindromic_Substring;

public class Solution {

    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);

            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }

        return res;
    }

    // 在 s 中寻找以 s[l] 和 s[r] 为中心的最长回文串
    private String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.longestPalindrome("babad");
    }
}
