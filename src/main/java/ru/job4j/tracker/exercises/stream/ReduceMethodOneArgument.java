package ru.job4j.tracker.exercises.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((f, s) -> f * s)
                .orElse(-1);
    }
}
