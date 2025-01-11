package com.kotlin.study.section4.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaLambda {

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_500),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 2_500),
                new Fruit("바나나", 3_200),
                new Fruit("수박", 10_000)
                );
    }

    private List<Fruit> filter(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if(predicate.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }
}
