package com.kaitian.fukingalgrithm.graph.no694_Number_of_Distinct_Islands;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numDistinctIslands(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        Set<String> islands = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, 666);
                    islands.add(sb.toString());
                }
            }
        }
        return islands.size();
    }
    private void dfs(int[][] grid, int i, int j, StringBuilder sb, int dir) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n
                || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        sb.append(dir).append(',');

        dfs(grid, i - 1, j, sb, 1); // 上
        dfs(grid, i + 1, j, sb, 2); // 下
        dfs(grid, i, j - 1, sb, 3); // 左
        dfs(grid, i, j + 1, sb, 4); // 右

        sb.append(-dir).append(',');
    }
}
