package com.kaitian.fukingalgrithm.array.no344_Reverse_String;

public class Solution {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left <= right) {
            swap(s, left, right);

            left++;
            right--;
        }
    }

    private void swap(char[] s, int idx1, int idx2) {
        char tmp = s[idx1];
        s[idx1] = s[idx2];
        s[idx2] = tmp;
    }

}
