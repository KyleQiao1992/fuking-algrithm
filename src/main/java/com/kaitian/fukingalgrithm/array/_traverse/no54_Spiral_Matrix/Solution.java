package com.kaitian.fukingalgrithm.array._traverse.no54_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int upperBound = 0, lowerBound = m - 1;
        int leftBound = 0, rightBound = n - 1;

        List<Integer> res = new ArrayList<>();
        while (res.size() < m * n) {
            if (upperBound <= lowerBound) {
                for (int j = leftBound; j <= rightBound; j++) {
                    res.add(matrix[upperBound][j]);
                }
                upperBound++;
            }

            if (leftBound <= rightBound) {
                for (int i = upperBound; i <= lowerBound; i++) {
                    res.add(matrix[i][rightBound]);
                }
                rightBound--;
            }

            if (upperBound <= lowerBound) {
                for (int j = rightBound; j >= leftBound; j--) {
                    res.add(matrix[lowerBound][j]);
                }
                lowerBound--;
            }

            if (leftBound <= rightBound) {
                for (int i = lowerBound; i >= upperBound; i--) {
                    res.add(matrix[i][leftBound]);
                }
                leftBound++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[]{9, 10, 11, 12};
        matrix[3] = new int[]{13, 14, 15, 16};
        f.spiralOrder(matrix);
    }
}
