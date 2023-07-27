package com.kaitian.fukingalgrithm.hash.no2325_Decode_the_Message;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> keyMap = new HashMap<>();

        char ascii = 97;
        for (char c : key.toCharArray()) {
            if (keyMap.containsKey(c)) {
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                keyMap.put(c, ascii++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(keyMap.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
}
