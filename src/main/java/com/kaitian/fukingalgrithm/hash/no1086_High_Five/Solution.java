package com.kaitian.fukingalgrithm.hash.no1086_High_Five;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int[][] highFive(int[][] items) {
        return Stream.of(items)
                .collect(Collectors.groupingBy(item -> item[0]))
                .entrySet()
                .stream()
                .map(entry -> new int[]{entry.getKey(), entry.getValue()
                        .stream()
                        .sorted(Comparator.comparingInt(item -> -item[1]))
                        .mapToInt(item -> item[1])
                        .limit(5)
                        .sum() / 5})
                .toArray(int[][]::new);
    }

}
