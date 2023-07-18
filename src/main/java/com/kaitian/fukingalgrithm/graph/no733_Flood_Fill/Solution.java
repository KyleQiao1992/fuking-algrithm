package com.kaitian.fukingalgrithm.graph.no733_Flood_Fill;

public class Solution {
    private boolean[][] visited;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.visited = new boolean[image.length][image[0].length];
        int originColor = image[sr][sc];
        dfs(image, sr, sc, originColor, color);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int originColor, int newColor) {
        int m = image.length, n = image[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (image[i][j] != originColor) {
            return;
        }
        if (visited[i][j]) {
            return;
        }

        image[i][j] = newColor;
        visited[i][j] = true;
        dfs(image, i - 1, j, originColor, newColor);
        dfs(image, i + 1, j, originColor, newColor);
        dfs(image, i, j - 1, originColor, newColor);
        dfs(image, i, j + 1, originColor, newColor);
    }
}
