package com.kaitian.fukingalgrithm.hash.no804_Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public int uniqueMorseRepresentations(String[] words) {
        String[] mos = new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.","...."
                ,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for(String s : words){
            StringBuilder bf = new StringBuilder();
            for(char a : s.toCharArray()){
                String c = mos[a - 'a'];
                bf.append(c);
            }
            set.add(bf.toString());
        }
        return set.size();
    }
}
