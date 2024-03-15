package com.kaitian.fukingalgrithm.array._double_point.no151_Reverse_Words_in_a_String;

public class Solution3 {

    public String reverseWords(String s) {
        char[] reverseChar = reverse(s.toCharArray(), 0, s.length() - 1);

        int slow = 0, fast = 0;
        while (fast <= s.length()) {
            if (fast - 1 == reverseChar.length - 1 || reverseChar[fast] == ' ') {
                reverse(reverseChar, slow, fast - 1);

                fast++;
                slow = fast;
            }
            fast++;
        }

        return new String(reverseChar).trim();
    }

    private char[] reverse(char[] c, int startIdx, int endIdx) {
        int p = startIdx, q = endIdx;

        while (p < q) {
            char temp = c[p];
            c[p] = c[q];
            c[q] = temp;

            p++;
            q--;
        }
        return c;
    }

    public static void main(String[] args) {
        Solution3 f = new Solution3();
        f.reverseWords("the sky is blue");
    }
}
