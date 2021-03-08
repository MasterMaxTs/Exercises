package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DistinctForPrimitiveTest {

    @Test
    public void collect() {
        assertEquals(
                List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[]{1, 2, 3, 1, 2, 3})
        );
    }
}