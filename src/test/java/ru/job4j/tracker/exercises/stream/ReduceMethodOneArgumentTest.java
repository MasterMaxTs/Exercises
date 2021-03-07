package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReduceMethodOneArgumentTest {

    @Test
    public void reduce() {
        assertEquals(Integer.valueOf(1), ReduceMethodOneArgument.reduce(List.of(1)));
        assertEquals(Integer.valueOf(6), ReduceMethodOneArgument.reduce(
                List.of(1, 2, 3))
        );
        assertEquals(Integer.valueOf(-8), ReduceMethodOneArgument.reduce(
                List.of(1, -2, 4))
        );
    }

    @Test
    public void WhenEmptyListThenNegative() {
        assertEquals(Integer.valueOf(-1), ReduceMethodOneArgument.reduce(List.of()));
    }
}