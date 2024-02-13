package com.kaitian.fukingalgrithm.backtrack.no93_Restore_IP_Addresses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<String> res = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();


    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0);
        return res;
    }

    private void backtrack(String s, int startIdx) {
        if (startIdx == s.length() && path.size() == 4) {
            res.add(String.join(".", path));
            return;
        }

        for (int i = startIdx; i < s.length(); i++) {
            if (!isValid(s, startIdx, i)) {
                continue;
            }
            if (path.size() >= 4) {
                break;
            }
            path.addLast(s.substring(startIdx, i + 1));
            backtrack(s, i + 1);
            path.removeLast();
        }
    }

    private boolean isValid(String s, int startIdx, int endIdx) {
        int len = endIdx - startIdx + 1;
        if (len == 0 || len > 3) {
            return false;
        }
        if (len == 1) {
            return true;
        }
        if (s.charAt(startIdx) == '0') {
            return false;
        }
        if (len <= 2) {
            return true;
        }
        if (Integer.parseInt(s.substring(startIdx, startIdx + len)) > 255) {
            return false;
        } else {
            return true;
        }
    }
}
