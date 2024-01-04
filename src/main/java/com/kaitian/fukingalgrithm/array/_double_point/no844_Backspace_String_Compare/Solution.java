package com.kaitian.fukingalgrithm.array._double_point.no844_Backspace_String_Compare;

public class Solution {

    public boolean backspaceCompare(String s, String t) {
        return backSpaceCal(s).equals(backSpaceCal(t));
    }

    private String backSpaceCal(String s) {
        int fast = 0;
        int slow = 0;
        char[] sChar = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (fast < sChar.length) {
            if (sChar[fast] != '#') {
                sb.append(sChar[fast]);
                fast++;
                slow++;
            } else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(slow - 1);
                    slow--;
                }
                fast++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.backspaceCompare("ab#c", "ad#c");
    }
}
