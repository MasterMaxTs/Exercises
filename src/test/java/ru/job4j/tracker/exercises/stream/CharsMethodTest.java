package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CharsMethodTest {

    @Test
    public void chars() {
        assertEquals(
                List.of('H', 'e', 'l', 'l', 'o'), CharsMethod.chars("Hello")
        );
    }
}