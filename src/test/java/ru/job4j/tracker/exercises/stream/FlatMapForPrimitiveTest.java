package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlatMapForPrimitiveTest {

    @Test
    public void sum() {
        assertEquals(
                45,
                FlatMapForPrimitive.sum(new int[][] {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9},
                })
        );
    }
}