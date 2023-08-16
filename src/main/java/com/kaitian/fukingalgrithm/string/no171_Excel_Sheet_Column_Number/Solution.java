package com.kaitian.fukingalgrithm.string.no171_Excel_Sheet_Column_Number;

public class Solution {

    public int titleToNumber(String columnTitle) {
        int res = 0;

        int base = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            int count = columnTitle.charAt(i) - 'A' + 1;
            res += base * count;
            base *= 26;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.titleToNumber("AB");
    }
}
