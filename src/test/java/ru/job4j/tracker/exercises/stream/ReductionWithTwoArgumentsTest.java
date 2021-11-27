package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.ReductionWithTwoArguments;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReductionWithTwoArgumentsTest {

    @Test
    public void collect() {
        assertEquals(
                Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of())
        );
        assertEquals(
                Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of(1))
        );
        assertEquals(
                Integer.valueOf(10), ReductionWithTwoArguments.collect(List.of(1, 2))
        );
        assertEquals(
                Integer.valueOf(30), ReductionWithTwoArguments.collect(List.of(1, 2, 3))
        );
    }
}