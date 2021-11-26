package ru.job4j.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n % 2,
                                Collectors.summingInt(n -> n)
                        )
                )
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
