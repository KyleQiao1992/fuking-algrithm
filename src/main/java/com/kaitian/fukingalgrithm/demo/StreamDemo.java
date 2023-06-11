package com.kaitian.fukingalgrithm.demo;

import java.util.*;
import java.util.stream.Collectors;

import lombok.*;

public class StreamDemo {
    @Data
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Apple {
        private Integer weight;
        private String color;
    }

    public void testFilter() {
        List<Integer> arrayInt = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        List<Integer> res = arrayInt.stream()
                .filter(p -> p > 5)
                .collect(Collectors.toList());

        List<Apple> arrayObj = Arrays.asList(new Apple(1, "green"), new Apple(2, "green"));
        List<Apple> filterApples = arrayObj.stream()
                .filter(apple -> apple.weight >= 2)
                .collect(Collectors.toList());
    }

    public void testMap() {
        List<Apple> arrayObj = Arrays.asList(new Apple(1, "green"), new Apple(2, "green"));
        List<String> appleColorList = arrayObj.stream().map(p -> p.color).collect(Collectors.toList());

        Map<Integer, String> map = arrayObj.stream().collect(Collectors.toMap(Apple::getWeight, Apple::getColor));
    }

    public void testMax() {
        List<Integer> arrayInt = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        Integer maxVal = arrayInt.stream()
                .max(Integer::compare)
                .get();

        List<Apple> arrayObj = Arrays.asList(new Apple(1, "green"), new Apple(2, "green"));
        Apple maxWeightObj = arrayObj.stream()
                .max(Comparator.comparingInt(apple -> apple.weight))
                .get();
    }

    // Apple apple=new Apple();
    // if(apple!=null){
    //      return apple.getWeight();
    // }
    // return null;
    public Integer testOptional() {
        Apple apple = new Apple();
        Optional<Integer> weightOpt = Optional.of(apple).map(Apple::getWeight);
        return weightOpt.orElse(-1);
    }
}
