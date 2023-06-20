package com.kaitian.fukingalgrithm.tree.bt.no331_Verify_Preorder_Serialization_of_a_Binary_Tree;

import java.util.LinkedList;

public class Solution {

    public boolean isValidSerialization(String preorder) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : preorder.split(",")) {
            nodes.addLast(s);
        }
        return deserialized(nodes) && nodes.isEmpty();
    }

    private boolean deserialized(LinkedList<String> nodes) {
        if (nodes.isEmpty()) {
            return false;
        }

        String first = nodes.removeFirst();
        if (first.equals("#")) {
            return true;
        }
        return deserialized(nodes) && deserialized(nodes);
    }
}
