package com.kaitian.fukingalgrithm.backtrack.no52_N_Queens_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int res = 0;

    public int totalNQueens(int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }
        backtracking(board, 0);
        return res;
    }


    private void backtracking(List<String> board, int row) {
        if (row == board.size()) {
            res++;
            return;
        }

        int n = board.get(row).length();
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }

            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(col, 'Q');
            board.set(row, sb.toString());

            backtracking(board, row + 1);
            sb.setCharAt(col, '.');
            board.set(row, sb.toString());
        }
    }

    //是否可以再board[row][col]放置皇后
    private boolean isValid(List<String> board, int row, int col) {
        int n = board.size();
        // 检查列是否有皇后互相冲突
        for (int i = 0; i <= row; i++) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;

    }
}
