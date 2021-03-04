package ru.job4j.tracker.exercises;

import java.util.Optional;

public class OptionalIfPresent {
    public static Optional<Integer> max (int[] data) {
        if(data.length != 0) {
            int maxData = data[0];
            for (int i = 1; i < data.length; i++) {
                if (data[i] > maxData) {
                    maxData = data[i];
                }
            }
            return Optional.of(maxData);
        }
        return Optional.empty();
    }

    public static void ifPresent (int[] data) {
        max(data).ifPresent(m -> System.out.println("Max: " + m));
    }
}
