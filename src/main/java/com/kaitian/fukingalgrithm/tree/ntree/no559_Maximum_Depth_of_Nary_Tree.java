package com.kaitian.fukingalgrithm.tree.ntree;

public class no559_Maximum_Depth_of_Nary_Tree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            int childLength = maxDepth(child);
            max = Math.max(max, childLength);
        }
        return max + 1;
    }
}
