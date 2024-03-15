package com.kaitian.fukingalgrithm.array._traverse.no59_Spiral_Matrix_II;

public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int upperBound = 0, lowerBound = n - 1;
        int leftBound = 0, rightBound = n - 1;

        int num = 1;

        while (num <= n * n) {
            if (upperBound <= lowerBound) {
                for (int j = leftBound; j <= rightBound; j++) {
                    matrix[upperBound][j] = num;
                    num++;
                }
                upperBound++;
            }

            if (leftBound <= rightBound) {
                for (int i = upperBound; i <= lowerBound; i++) {
                    matrix[i][rightBound] = num;
                    num++;
                }
                rightBound--;
            }

            if (upperBound <= lowerBound) {
                for (int j = rightBound; j >= leftBound; j--) {
                    matrix[lowerBound][j] = num;
                    num++;
                }
                lowerBound--;
            }

            if (leftBound <= rightBound) {
                for (int i = lowerBound; i >= upperBound; i--) {
                    matrix[i][leftBound] = num;
                    num++;
                }
                leftBound++;
            }
        }

        return matrix;
    }
}
