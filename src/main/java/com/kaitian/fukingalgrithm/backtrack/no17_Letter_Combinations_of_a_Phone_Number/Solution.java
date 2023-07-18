package com.kaitian.fukingalgrithm.backtrack.no17_Letter_Combinations_of_a_Phone_Number;

import java.util.*;

public class Solution {
    private static Map<Character, List<String>> numberCharMap = new HashMap<>();

    static {
        numberCharMap.put('2', Arrays.asList("a", "b", "c"));
        numberCharMap.put('3', Arrays.asList("d", "e", "f"));
        numberCharMap.put('4', Arrays.asList("g", "h", "i"));
        numberCharMap.put('5', Arrays.asList("j", "k", "l"));
        numberCharMap.put('6', Arrays.asList("m", "n", "o"));
        numberCharMap.put('7', Arrays.asList("p", "q", "r", "s"));
        numberCharMap.put('8', Arrays.asList("t", "u", "v"));
        numberCharMap.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    private List<String> res = new LinkedList<>();
    private LinkedList<String> track = new LinkedList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        char[] digitCharList = digits.toCharArray();
        backtrack(digitCharList, 0);
        return res;
    }

    private void backtrack(char[] digitCharList, int startIdx) {
        if (track.size() == digitCharList.length) {
            res.add(String.join("", track));
            return;
        }

        for (int i = startIdx; i < digitCharList.length; i++) {
            List<String> charList = numberCharMap.get(digitCharList[i]);
            for (String s : charList) {
                track.addLast(s);
                backtrack(digitCharList, i + 1);
                track.removeLast();
            }
        }
    }


    public static void main(String[] args) {
        Solution f = new Solution();
        f.letterCombinations("234");
    }
}
