package com.kaitian.fukingalgrithm.graph.no79_Word_Search;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, word, 0);
                if (res) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean res = false;

    private void dfs(char[][] board, int i, int j, String word, int p) {
        if (p == word.length()) {
            res = true;
            return;
        }
        if (res) {
            return;
        }

        int m = board.length, n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (board[i][j] != word.charAt(p)) {
            return;
        }

        board[i][j] = (char) (-board[i][j]);
        // word[p] 被 board[i][j] 匹配，开始向四周搜索 word[p+1..]
        dfs(board, i + 1, j, word, p + 1);
        dfs(board, i, j + 1, word, p + 1);
        dfs(board, i - 1, j, word, p + 1);
        dfs(board, i, j - 1, word, p + 1);
        board[i][j] = (char) (-board[i][j]);
    }
}
