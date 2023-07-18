package com.kaitian.fukingalgrithm.hash.no500_Keyboard_Row;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            boolean f1 = false, f2 = false, f3 = false;
            // 判断当前遍历的元素是否出现在每一行键盘中
            for (int j = 0; j < cur.length(); j++) {
                if ("qwertyuiop".indexOf(cur.charAt(j)) != -1) {
                    f1 = true;
                }
                if ("asdfghjkl".indexOf(cur.charAt(j)) != -1) {
                    f2 = true;
                }
                if ("zxcvbnm".indexOf(cur.charAt(j)) != -1) {
                    f3 = true;
                }
            }
            if (f1 && !f2 && !f3 || !f1 && f2 && !f3 || !f1 && !f2 && f3) {
                ans.add(cur);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
