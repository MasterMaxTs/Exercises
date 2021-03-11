package ru.job4j.tracker.exercises;

import java.util.Objects;
import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        return indexOf(data, el).orElse(-1);
    }

    public static Optional<Integer> indexOf(int[]data, int el) {
        if (Objects.nonNull(data)) {
            for (int index = 0; index < data.length; index++) {
                if (data[index] == el) {
                    return Optional.of(index);
                }
            }
        }
        return Optional.empty();
    }
}
