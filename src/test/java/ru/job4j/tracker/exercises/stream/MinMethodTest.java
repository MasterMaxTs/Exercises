package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MinMethodTest {

    @Test
    public void min() {
        assertEquals(
                "a",
                MinMethod.min(List.of("ccc", "bb", "a"))
        );
    }

    @Test (expected = NoSuchElementException.class)
    public void whenListIsEmpty() {
        assertEquals(
                "a",
                MinMethod.min(List.of())
        );
    }
}