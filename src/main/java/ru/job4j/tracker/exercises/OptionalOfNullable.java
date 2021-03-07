package ru.job4j.tracker.exercises;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue (List<String> strings, String value) {
        for (String s :
                strings) {
            if (Objects.equals(s, value)) {
                return Optional.ofNullable(value);
            }
        }
        return Optional.empty();
    }
}
