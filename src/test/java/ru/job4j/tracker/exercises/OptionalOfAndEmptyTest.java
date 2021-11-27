package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.OptionalOfAndEmpty;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalOfAndEmptyTest {

    @Test
    public void whenExists() {
        assertEquals(
                Optional.of("c"),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNotExists() {
        assertEquals(
                Optional.empty(),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "d"
                )
        );
    }
}