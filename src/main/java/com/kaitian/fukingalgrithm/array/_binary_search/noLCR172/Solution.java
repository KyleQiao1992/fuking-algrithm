package com.kaitian.fukingalgrithm.array._binary_search.noLCR172;

public class Solution {

    public int countTarget(int[] scores, int target) {
        if (scores == null || scores.length == 0) {
            return 0;
        }

        if (scores.length == 1) {
            return scores[0] == target ? 1 : 0;
        }

        int leftBound = findLeftBoundIdx(scores, target);
        int rightBound = findRightBoundIdx(scores, target);
        if (leftBound == -1 || rightBound == -1) {
            return 0;
        }

        return rightBound - leftBound + 1;
    }

    private int findLeftBoundIdx(int[] scores, int target) {
        int left = 0, right = scores.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > scores[mid]) {
                left = mid + 1;
            } else if (target < scores[mid]) {
                right = mid - 1;
            } else if (target == scores[mid]) {
                right = mid - 1;
            }
        }

        if (left < 0 || left >= scores.length) {
            return -1;
        }
        return scores[left] == target ? left : -1;
    }

    private int findRightBoundIdx(int[] scores, int target) {
        int left = 0, right = scores.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > scores[mid]) {
                left = mid + 1;
            } else if (target < scores[mid]) {
                right = mid - 1;
            } else if (target == scores[mid]) {
                left = mid + 1;
            }
        }

        if (right < 0 || right >= scores.length) {
            return -1;
        }
        return scores[right] == target ? right : -1;
    }
}
