package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.OptionalOfNullable;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalOfNullableTest {

    @Test
    public void whenNotNull() {
        assertEquals(
                Optional.of("c"),
                OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNull() {
        assertEquals(
                Optional.empty(),
                OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c", null),
                        null
                )
        );
    }
}